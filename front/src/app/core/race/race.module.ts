import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';


import { RaceComponent } from './race.component';


@NgModule({
  declarations: [
    RaceComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [RaceComponent]
})
export class RaceModule { }
