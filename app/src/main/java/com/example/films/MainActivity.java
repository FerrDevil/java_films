package com.example.films;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    private final String[] comedy = {"Операция «Ы» и другие приключения Шурика", "Иван Васильевич меняет профессию", "Бриллиантовая рука", "Джентльмены удачи", "Большой Лебовски"};
    private final String[] detectiveStory = {"Шерлок Холмс и доктор Ватсон: Собака Баскервилей", "Шерлок Холмс и доктор Ватсон: Знакомство", "Шерлок Холмс и доктор Ватсон: Охота на тигра", "Шерлок Холмс и доктор Ватсон: Смертельная схватка", "Остров проклятых"};
    private final String[] action = {"Брат", "Матрица", "300 спартанцев", "Карты, деньги, два ствола", "Дюна"};
    private final String[] melodrama = {"Москва слезам не верит", "Служебный роман", "Титаник", "Морозко", "Ла-Ла Ленд"};
    private final String[] adventure = {"Жизнь Пи", "Властелин колец: Братство кольца", "Королевство полной луны", "Трое негодяев в скрытой крепости", "Волкодав"};
    private final String[] ours = {"Операция «Ы» и другие приключения Шурика", "Иван Васильевич меняет профессию", "Бриллиантовая рука", "Джентльмены удачи", "Волкодав", "Шерлок Холмс и доктор Ватсон: Собака Баскервилей", "Шерлок Холмс и доктор Ватсон: Знакомство", "Шерлок Холмс и доктор Ватсон: Охота на тигра", "Шерлок Холмс и доктор Ватсон: Смертельная схватка", "Брат", "Москва слезам не верит", "Служебный роман", "Морозко"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void findFilm(View view){
        TextView films = findViewById(R.id.films);
        Spinner genre= findViewById(R.id.genre);
        Spinner whose = findViewById(R.id.whose);
        String result = "";
        switch (genre.getSelectedItem().toString()){
            case "Комедия":
                if (whose.getSelectedItem().toString().equals("Отечественное")){
                    for (String film: comedy) {
                        for (String film1: ours){
                            if (film.equals(film1)) {
                                result += film + "\n";
                            }
                        }
                    }
                }
                break;

            case "Мелодрама":
                if (whose.getSelectedItem().toString().equals("Отечественное")){
                    for (String film: melodrama) {
                        for (String film1: ours){
                            if (film.equals(film1)) {
                                result += film + "\n";
                            }
                        }
                    }
                }
                break;

            case "Боевик":
                if (whose.getSelectedItem().toString().equals("Отечественное")){
                    for (String film: action) {
                        for (String film1: ours){
                            if (film.equals(film1)) {
                                result += film + "\n";
                            }
                        }
                    }
                }
                break;

            case "Детектив":
                if (whose.getSelectedItem().toString().equals("Отечественное")){
                    for (String film: detectiveStory) {
                        for (String film1: ours){
                            if (film.equals(film1)) {
                                result += film + "\n";
                            }
                        }
                    }
                }
                break;

            case "Приключения":
                if (whose.getSelectedItem().toString().equals("Отечественное")){
                    for (String film: adventure) {
                        for (String film1: ours){
                            if (film.equals(film1)) {
                                result += film + "\n";
                            }
                        }
                    }
                }
                break;
        }
        if (!(result.equals(""))){
            result = result.substring(0, result.length()-1);
            films.setText(result);
        }

    }
}
