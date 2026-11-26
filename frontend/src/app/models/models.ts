export interface SongResponse {
  id: number;
  title: string;
  artist: string;
  hasAcoustic: boolean;
  hasElectric: boolean;
}

export interface SongRequest {
  title: string;
  artist: string;
  hasAcoustic: boolean;
  hasElectric: boolean;
}

export interface AcousticTodoRequest {
  songId: number;
  link: string;
}

export interface AcousticTodoResponse {
  id: number;
  songId: number;
  title: string;
  artist: string;
  link: string;
}