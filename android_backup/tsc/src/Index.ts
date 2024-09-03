import {Fragment} from './app/Fragment';
import { DialogHelper } from './helpers/DialogHelper';

export default class Index extends Fragment{
    constructor() {
        super();
    }
    
    public onCreate(obj:any) {
    	DialogHelper.alert("If you receive this  alert, you are good to write your first program", () => {});
    }
}