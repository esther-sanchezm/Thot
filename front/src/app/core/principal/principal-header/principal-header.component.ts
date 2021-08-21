import { Component } from "@angular/core";

@Component({
    selector: 'principal-header',
    templateUrl: './principal-header.component.html'
})
export class PrincipalHeaderComponent {
    title : string = 'Thot';
    description : string = 'Application to create lore of fantasy';
}