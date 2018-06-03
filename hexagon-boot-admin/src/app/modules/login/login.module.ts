import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { LoginComponent } from './login.component';
import {RouterModule} from "@angular/router";
import {
  MatButtonModule,
  MatCardModule,
  MatGridListModule,
  MatIconModule, MatInputModule,
  MatMenuModule,
  MatToolbarModule
} from "@angular/material";
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import {TranslateModule} from "@ngx-translate/core";
import {ApiModule} from "../@common/api/api.module";

@NgModule({
  imports: [
    CommonModule,
    MatGridListModule,
    MatCardModule,
    MatMenuModule,
    MatToolbarModule,
    MatIconModule,
    MatInputModule,
    MatButtonModule,
    FormsModule,
    ReactiveFormsModule,
    TranslateModule,
    RouterModule.forChild([
      {
        path: '**',
        component: LoginComponent,
      }]),

    ApiModule
  ],
  exports: [RouterModule],
  declarations: [LoginComponent]
})
export class LoginModule { }
