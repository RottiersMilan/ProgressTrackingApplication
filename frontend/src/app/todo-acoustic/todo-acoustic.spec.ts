import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TodoAcoustic } from './todo-acoustic';

describe('TodoAcoustic', () => {
  let component: TodoAcoustic;
  let fixture: ComponentFixture<TodoAcoustic>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [TodoAcoustic],
    }).compileComponents();

    fixture = TestBed.createComponent(TodoAcoustic);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
