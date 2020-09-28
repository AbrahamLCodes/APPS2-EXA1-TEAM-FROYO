package froyo.examen1.mostrarimagen1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener {

    private SeekBar seekBar;
    private Fragment[] fragmentos = {new PorUno(), new PorDos(), new PorTres(), new PorCuatro()};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekBar = findViewById(R.id.seekBar);
        seekBar.setOnSeekBarChangeListener(this);
        if(getOrientation() == 1){
            setFragmentLand(new PorUno(), new PorDos(), new PorTres());
        }else{
            setFragmentPor(new PorUno());
        }
    }


    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        replace(progress);
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
    }

    private void replace(int progress) {
        if (getOrientation() == 1) {
            if(progress > 0 && progress < 4 ){
                replaceFragmenLand(progress);
            }
        } else {
            replaceFragmentPortrait(progress);
        }
    }

    private void replaceFragmenLand(int progress){

        switch (progress){
            case 1:
                setFragmentLand(new PorDos(), new PorTres(), new PorCuatro());
                break;
            case 2:
                setFragmentLand(new PorTres(), new PorCuatro(), new PorCinco());
                break;
            case 3:
                setFragmentLand(new PorCuatro(), new PorCinco(), new PorSeis());
                break;

        }
    }

    private void replaceFragmentPortrait(int progress){
        switch (progress){
            case 1:
                setFragmentPor(new PorUno());
                break;
            case 2:
                setFragmentPor(new PorDos());
                break;
            case 3:
                setFragmentPor(new PorTres());
                break;
            case 4:
                setFragmentPor(new PorCuatro());
                break;
            case 5:
                setFragmentPor(new PorCinco());
                break;
            case 6:
                setFragmentPor(new PorSeis());
                break;

        }
    }

    private void setFragmentPor(Fragment fragment){
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.fmf, fragment);
        ft.commit();
    }

    private void setFragmentAux(Fragment fragment, int layout){
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(layout, fragment);
        ft.commit();
    }

    private void setFragmentLand(Fragment fragment1, Fragment fragment2, Fragment fragment3){
        setFragmentAux(fragment1, R.id.land1);
        setFragmentAux(fragment2, R.id.land2);
        setFragmentAux(fragment3, R.id.land3);
    }

    private int getOrientation() {
        if (getResources().getDisplayMetrics().widthPixels > getResources().getDisplayMetrics().heightPixels) {
            //LANDSCAPE
            return 1;
        } else {
            //PORTRAIT
            return 2;
        }
    }
}