import { Component, OnInit } from "@angular/core";
import { RaceElement } from "../race.model";

@Component({
    selector: 'race-list',
    templateUrl: './race-list.component.html',
    styleUrls: ['./race-list.component.css']
  })
  export class RaceListComponent implements OnInit {
    
    races: RaceElement[] = [
      new RaceElement('Human','These were the stories of a restless people who long ago took to the seas and rivers in longboats, first to pillage and terrorize, then to settle. Yet there was an energy, a love of adventure, that sang from every page. Long into the night Liriel read, lighting candle after precious candle.',''),
      new RaceElement('Elf','Elves are a magical people of otherworldly grace, living in the world but not entirely part of it. They live in places of ethereal beauty, in the midst of ancient forests or in silvery spires glittering with faerie light, where soft music drifts through the air and gentle fragrances waft on the breeze. ',''),
      new RaceElement('Dwarf','Kingdoms rich in ancient grandeur, halls carved into the roots of mountains, the echoing of picks and hammers in deep mines and blazing forges, a commitment to clan and tradition, and a burning hatred of goblins and orcs—these common threads unite all dwarves.',''),
      new RaceElement('Dragonborn','Born of dragons, as their name proclaims, the dragonborn walk proudly through a world that greets them with fearful incomprehension. Shaped by draconic gods or the dragons themselves, dragonborn originally hatched from dragon eggs as a unique race, combining the best attributes of dragons and humanoids.',''),
      new RaceElement('Halfling','The comforts of home are the goals of most halflings’ lives: a place to settle in peace and quiet, far from marauding monsters and clashing armies; a blazing fire and a generous meal; fine drink and fine conversation.',''),
    ];
    
    ngOnInit(){
  
    }
  }
  