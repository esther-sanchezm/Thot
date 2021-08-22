import { Component, OnInit } from "@angular/core";

@Component({
    selector: 'race-header',
    templateUrl: './race-header.component.html',
    styleUrls: ['./race-header.component.css']
  })
  export class RaceHeaderComponent {
    title : string = 'Race';
    description : string = 'Different creatures of the lore.';
  }
  