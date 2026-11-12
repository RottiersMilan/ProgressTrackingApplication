import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

import {
  AcousticTodoRequest,
  AcousticTodoResponse
} from '../../models/models';

@Injectable({
  providedIn: 'root'
})
export class AcousticTodoService {

  private apiUrl = 'http://localhost:8080/api/acoustic-todos';

  constructor(private http: HttpClient) {}

  // Alle acoustic todos ophalen
  getAllTodos(): Observable<AcousticTodoResponse[]> {
    return this.http.get<AcousticTodoResponse[]>(this.apiUrl);
  }

  // Song toevoegen aan acoustic todo
  addTodo(songId: number): Observable<AcousticTodoResponse> {

    const request: AcousticTodoRequest = {
      songId: songId
    };

    return this.http.post<AcousticTodoResponse>(
      this.apiUrl,
      request
    );
  }

  // Todo verwijderen
  deleteTodo(id: number): Observable<void> {
    return this.http.delete<void>(`${this.apiUrl}/${id}`);
  }
}