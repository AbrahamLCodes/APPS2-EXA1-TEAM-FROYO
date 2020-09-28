package froyo.examen1.tabulador;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import com.example.tabulador.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mostrar1 (View v){
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        shuttleFragment ShuttleFragment = new shuttleFragment();
        ft.replace(R.id.frmLytFrag, ShuttleFragment);
        ft.commit();
    }

    public void mostrar2 (View v){
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            AresFragment aresFragment = new AresFragment();
            ft.replace(R.id.frmLytFrag, aresFragment);
            ft.commit();
    }

    public void mostrar3 (View v){
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        falconFragment FalconFragment = new falconFragment();
        ft.replace(R.id.frmLytFrag, FalconFragment);
        ft.commit();
    }

}