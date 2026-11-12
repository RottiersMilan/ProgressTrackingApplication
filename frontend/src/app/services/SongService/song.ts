import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { SongRequest, SongResponse } from '../../models/models';

@Injectable({
  providedIn: 'root',
})
export class Song {
    private apiUrl = 'http://localhost:8080/api/songs';

    constructor(private http: HttpClient) {}

  addTodo(title: string, artist: string, link: string): Observable<SongResponse> {
  
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
}
