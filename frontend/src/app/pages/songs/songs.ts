
import { Component, OnInit } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { SongResponse } from '../../models/models';
import { SongService } from '../../services/SongService/song';
import { HostBinding } from '@angular/core';

@Component({
  selector: 'app-songs',
  imports: [FormsModule],
  templateUrl: './songs.html',
  styleUrl: './songs.scss',
})
export class Songs implements OnInit {

  songs: SongResponse[] = [];
  IsAdding: boolean = false;

  title: string = '';
  artist: string = '';
  tutorialLink: string = '';

  constructor(private songService: SongService) { }

  ngOnInit(): void {
    this.songService.getAllSongs().subscribe({
      next: (data) => {
        this.songs = data;
      },
      error: (error) => console.error('Error fetching songs:', error)
    });
  }

  StartAdding() {
    this.IsAdding = true;
  }

  deleteSong(id: number) {
    if (confirm('Ben je zeker dat je dit liedje wilt verwijderen?')) {
      this.songService.deleteSong(id).subscribe({
        next: () => {
          this.songs = this.songs.filter(song => song.id !== id);
        },
        error: (error) => console.error('Error deleting song:', error)
      });
    }
  }

  addSong() {
    if (!this.title.trim() || !this.artist.trim()) {
      alert('Vul minstens een titel en artiest in!');
      return;
    }

    this.songService.addSong(
      this.title,
      this.artist,
      false,
      false
    ).subscribe({
      next: (song) => {
        this.songs.push(song);

        this.title = '';
        this.artist = '';
        this.tutorialLink = '';

        this.IsAdding = false;
      },
      error: (error) => console.error('Error adding song:', error)
    });
  }

  @HostBinding('class.no-scroll')
  get noScroll() {
    return this.IsAdding;
  }
}
