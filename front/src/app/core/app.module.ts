import { NgModule } from "@angular/core";
import { BrowserModule } from "@angular/platform-browser";
import { RouterModule, Routes } from "@angular/router";
import { AppComponent } from "./app.component";
import { PrincipalComponent } from "./principal/principal.component";
import { PrincipalModule } from "./principal/principal.module";
import { RaceComponent } from "./race/race.component";
import { RaceModule } from "./race/race.module";

const principalRoutes : Routes = [
    { path : '', component: PrincipalComponent},
    { path : 'race', component: RaceComponent} 
  
  ]
@NgModule({
    declarations: [
        AppComponent
    ],
    imports: [
      BrowserModule,
      RouterModule.forRoot(principalRoutes),
      PrincipalModule,
      RaceModule
    ],
    providers: [],
    bootstrap: [AppComponent]
  })
  export class AppModule { }