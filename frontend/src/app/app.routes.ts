import { Routes } from '@angular/router';
import { HomePage } from './home-page/home-page';
import { TodoAcoustic } from './todo-acoustic/todo-acoustic';
import { FinishedAcoustic } from './finished-acoustic/finished-acoustic';
import { TodoElectric } from './todo-electric/todo-electric';
import { FinishedElectric } from './finished-electric/finished-electric';

export const routes: Routes = [
  { path: '', component: HomePage },
  { path: 'todoAcoustic', component: TodoAcoustic },
  { path: 'todoElectric', component: TodoElectric },
  { path: 'finishedAcoustic', component: FinishedAcoustic },
  { path: 'finishedElectric', component: FinishedElectric }
];