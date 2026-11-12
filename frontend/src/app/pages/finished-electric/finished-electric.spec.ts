import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FinishedElectric } from './finished-electric';

describe('FinishedElectric', () => {
  let component: FinishedElectric;
  let fixture: ComponentFixture<FinishedElectric>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [FinishedElectric],
    }).compileComponents();

    fixture = TestBed.createComponent(FinishedElectric);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
