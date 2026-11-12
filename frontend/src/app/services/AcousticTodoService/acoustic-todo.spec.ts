import { TestBed } from '@angular/core/testing';

import { AcousticTodo } from './acoustic-todo';

describe('AcousticTodo', () => {
  let service: AcousticTodo;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(AcousticTodo);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
