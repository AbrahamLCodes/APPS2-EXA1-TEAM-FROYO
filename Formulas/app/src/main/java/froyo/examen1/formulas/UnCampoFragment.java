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


public class UnCampoFragment extends Fragment {

    private TextView titulouno;
    private ImageView imagenuno;
    private EditText campounico;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_un_campo, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        titulouno = view.findViewById(R.id.titulouno);
        imagenuno = view.findViewById(R.id.imagenuno);
        campounico = view.findViewById(R.id.campounico);

        titulouno.setText(Mediador.getTitulo());
        imagenuno.setImageResource(Mediador.getIdImagen());
        campounico.setHint(Mediador.getHint1());
    }
}