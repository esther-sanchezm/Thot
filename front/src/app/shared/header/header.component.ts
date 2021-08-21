import { Component } from "@angular/core";

@Component({
    selector: 'header-app',
    templateUrl: './header.component.html'
})
export class HeaderComponent {
    title : string = 'Thot';
    description : string = 'Application to create lore of fantasy';
}