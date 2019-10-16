import { ValidationErrors, AbstractControl } from '@angular/forms';








export class CustomValidationComponent {
    constructor() {}
    static unique(control : AbstractControl): ValidationErrors | null {
        if (control.value === 'bahubalii') {
            return {unique : true};
        } else {
            return null;
        }
    }

}