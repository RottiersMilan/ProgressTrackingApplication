import { TestBed } from '@angular/core/testing';

import { AcousticTodoService } from './acoustic-todo';

describe('AcousticTodo', () => {
  let service: AcousticTodoService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(AcousticTodoService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
