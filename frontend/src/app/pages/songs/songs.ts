import { Component, OnInit } from '@angular/core';
import { SongResponse } from '../../models/models';
import { SongService } from '../../services/SongService/song';

@Component({
  selector: 'app-songs',
  imports: [],
  templateUrl: './songs.html',
  styleUrl: './songs.scss',
})
export class Songs implements OnInit {

  songs: SongResponse[] = [];

  constructor(private songService: SongService) {}

  ngOnInit(): void {
    this.songService.getAllSongs().subscribe({
      next: (data) => {
        this.songs = data;
      },
      error: (error) => {
        console.error('Error fetching songs:', error);
      }
    });
  }
}