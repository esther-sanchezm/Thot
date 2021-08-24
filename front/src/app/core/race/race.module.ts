import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';


import { RaceComponent } from './race.component';
import { RaceHeaderComponent } from './race-header/race-header.component';
import { RaceListComponent } from './race-list/race-list.component';
import { RouterModule, Routes } from '@angular/router';
import { RaceDetailModule } from './race-list/race-detail/race.detail.module';
import { RaceDetailComponent } from './race-list/race-detail/race-detail.component';

const raceRoutes : Routes = [
  { path : 'race/:id', component: RaceDetailComponent} 
]
@NgModule({
  declarations: [
    RaceComponent,
    RaceHeaderComponent,
    RaceListComponent
  ],
  imports: [
    BrowserModule,
    RaceDetailModule,
    RouterModule.forRoot(raceRoutes)
  ],
  providers: [],
  bootstrap: [RaceComponent]
})
export class RaceModule { }
