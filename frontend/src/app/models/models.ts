export interface Song {
  id: number;
  title: string;
  artist: string;
  link: string;
  genre: string;
}

export interface SongRequest {
  title: string;
  artist: string;
  link: string;
  genre: string;
}

export interface AcousticTodoRequest {
  songId: number;
}

export interface AcousticTodoResponse {
  id: number;
  songId: number;
  title: string;
  artist: string;
  link: string;
  genre: string;
}