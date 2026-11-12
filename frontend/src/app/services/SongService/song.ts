import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { SongRequest, SongResponse } from '../../models/models';

@Injectable({
  providedIn: 'root',
})
export class SongService {
    private apiUrl = 'http://localhost:8080/api/songs';

    constructor(private http: HttpClient) {}

    getAllSongs(): Observable<SongResponse[]> {
      return this.http.get<SongResponse[]>(this.apiUrl);
    }

  addSong(title: string, artist: string, link: string): Observable<SongResponse> {
  
      const request: SongRequest = {
        title: title,
        artist: artist,
        link: link
      };
  
      return this.http.post<SongResponse>(
        this.apiUrl,
        request
      );
  }

  deleteSong(id: number): Observable<void> {
    return this.http.delete<void>(`${this.apiUrl}/${id}`);
  }
}
