import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';

import {AppComponent} from './app.component';
import {FontSizeEditorComponent} from './font-size-editor/font-size-editor.component';
import {PetComponent} from './pet/pet.component';
import {CalculatorComponent} from './calculator/calculator.component';
import {ColorPickerComponent} from './color-picker/color-picker.component';
import {NameCardComponent} from './name-card/name-card.component';
import {ProgressBarComponent} from './progress-bar/progress-bar.component';
import {RatingBarComponent} from './rating-bar/rating-bar.component';
import {CountdownComponent} from './countdown/countdown.component';
import {TodoComponent} from './todo/todo.component';
import {ReactiveFormsModule} from '@angular/forms';
import {LoginComponent} from './login/login.component';
import {RegisterFinalComponent} from './register-final/register-final.component';
import {RegisterComponent} from './register/register.component';
import {TimelinesComponent} from './timelines/timelines.component';
import {AppRoutingModule} from './app-routing.module';
import {YoutubePlaylistComponent} from './youtube-playlist/youtube-playlist.component';
import {YoutubePlayerComponent} from './youtube-player/youtube-player.component';
import {DictionaryComponent} from './dictionary/dictionary.component';
import {DictionaryDetailComponent} from './dictionary-detail/dictionary-detail.component';
import {DictionaryPageComponent} from './dictionary-page/dictionary-page.component';
import {ImageGalleryModule} from './image-gallery/image-gallery.module';
import {GalleryConfig} from './image-gallery/token';


@NgModule({
  declarations: [
    AppComponent,
    FontSizeEditorComponent,
    PetComponent,
    CalculatorComponent,
    ColorPickerComponent,
    NameCardComponent,
    ProgressBarComponent,
    RatingBarComponent,
    CountdownComponent,
    TodoComponent,
    LoginComponent,
    RegisterFinalComponent,
    RegisterComponent,
    TimelinesComponent,
    YoutubePlaylistComponent,
    YoutubePlayerComponent,
    DictionaryComponent,
    DictionaryDetailComponent,
    DictionaryPageComponent,


  ],
  imports: [
    BrowserModule,
    ReactiveFormsModule,
    AppRoutingModule,
    ImageGalleryModule
  ],
  providers: [
    {provide: GalleryConfig, useValue: 2}
  ],
  bootstrap: [AppComponent]
})
export class AppModule {
}
