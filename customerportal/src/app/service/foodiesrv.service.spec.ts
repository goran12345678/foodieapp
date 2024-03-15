import { TestBed } from '@angular/core/testing';

import { FoodieService } from './foodiesrv.service';

describe('FoodiesrvService', () => {
  let service: FoodieService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(FoodieService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
