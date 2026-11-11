import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TodoElectric } from './todo-electric';

describe('TodoElectric', () => {
  let component: TodoElectric;
  let fixture: ComponentFixture<TodoElectric>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [TodoElectric],
    }).compileComponents();

    fixture = TestBed.createComponent(TodoElectric);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
