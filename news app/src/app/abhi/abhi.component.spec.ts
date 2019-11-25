import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AbhiComponent } from './abhi.component';

describe('AbhiComponent', () => {
  let component: AbhiComponent;
  let fixture: ComponentFixture<AbhiComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AbhiComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AbhiComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
