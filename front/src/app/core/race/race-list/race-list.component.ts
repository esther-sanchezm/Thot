import { Component, OnInit } from "@angular/core";
import { RaceElement } from "../race.model";

@Component({
    selector: 'race-list',
    templateUrl: './race-list.component.html',
    styleUrls: ['./race-list.component.css']
  })
  export class RaceListComponent implements OnInit {
    races: RaceElement[] = [
      new RaceElement('Human','',''),
      new RaceElement('Elf','',''),
      new RaceElement('Dwarf','',''),
      new RaceElement('Gnome','',''),     
    ];
    ngOnInit(){
  
    }
  }
  