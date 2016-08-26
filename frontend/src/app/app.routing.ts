import {Routes, RouterModule} from "@angular/router";
import {HomeComponent} from "./home/home.component";
import {AboutComponent} from "./about/about.component";
import {EmployeeDetailComponent} from "./employee/employee-detail.component";

const appRoutes: Routes = [
    {path: 'home', component: HomeComponent},
    {path: 'about', component: AboutComponent},
    {path: 'employee', component: EmployeeDetailComponent},
    {path: 'employee/:id', component: EmployeeDetailComponent},
    {path: '',redirectTo: '/home',pathMatch: 'full'}
];

export const routing = RouterModule.forRoot(appRoutes);