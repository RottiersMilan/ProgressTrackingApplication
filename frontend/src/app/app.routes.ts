import { Routes } from '@angular/router';
import { HomePage } from './pages/home-page/home-page';
import { TodoAcoustic } from './pages/todo-acoustic/todo-acoustic';
import { FinishedAcoustic } from './pages/finished-acoustic/finished-acoustic';
import { TodoElectric } from './pages/todo-electric/todo-electric';
import { FinishedElectric } from './pages/finished-electric/finished-electric';
import { Songs } from './pages/songs/songs';

export const routes: Routes = [
  { path: '', component: HomePage },
  { path: 'songs', component: Songs},
  { path: 'todoAcoustic', component: TodoAcoustic },
  { path: 'todoElectric', component: TodoElectric },
  { path: 'finishedAcoustic', component: FinishedAcoustic },
  { path: 'finishedElectric', component: FinishedElectric }
];