import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FinishedAcoustic } from './finished-acoustic';

describe('FinishedAcoustic', () => {
  let component: FinishedAcoustic;
  let fixture: ComponentFixture<FinishedAcoustic>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [FinishedAcoustic],
    }).compileComponents();

    fixture = TestBed.createComponent(FinishedAcoustic);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
