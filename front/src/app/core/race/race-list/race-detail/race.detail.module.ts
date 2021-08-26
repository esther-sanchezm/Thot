import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';


import { RaceDetailComponent } from './race-detail.component';


@NgModule({
  declarations: [
    RaceDetailComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [RaceDetailComponent]
})
export class RaceDetailModule { }
