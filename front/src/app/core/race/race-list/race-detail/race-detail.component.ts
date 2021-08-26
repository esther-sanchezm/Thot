import { Component, OnInit } from "@angular/core";
import { RaceDetailElement } from "../../race.model";

@Component({
    selector: 'race-detail',
    templateUrl: './race-detail.component.html',
    styleUrls: ['./race-detail.component.css']
  })
  export class RaceDetailComponent implements OnInit {
     raceDetail : RaceDetailElement = new RaceDetailElement('Elf','Description','dsa','dsa','dsa');

     
    ngOnInit(){
  
    }
}