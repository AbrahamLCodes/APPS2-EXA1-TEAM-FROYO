package froyo.examen1.formulas;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;


public class DosCamposFragment extends Fragment {

    private TextView titulodos;
    private ImageView imagendos;
    private EditText campouno;
    private EditText campodos;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dos_campos, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        titulodos = view.findViewById(R.id.titulodos);
        imagendos = view.findViewById(R.id.imagendos);
        campouno = view.findViewById(R.id.campouno);
        campodos = view.findViewById(R.id.campodos);

        titulodos.setText(Mediador.getTitulo());
        imagendos.setImageResource(Mediador.getIdImagen());
        campouno.setHint(Mediador.getHint1());
        campodos.setHint(Mediador.getHint2());
    }
}