package froyo.examen1.formulas;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class MenuFragment extends Fragment {

    private ListView lista;
    private String[] formulas = {"Círculo" , "Trapecio", "Triángulo", "Rombo", "Esfera",
            "Cuadrado", "Rectángulo", "Cubo", "Cilindro", "Ovalo"};
    private NavController navController;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_menu, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        lista = view.findViewById(R.id.lista);


        lista.setAdapter(new ArrayAdapter<>(getContext(),
                android.R.layout.simple_list_item_1, formulas));

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                chooseFragment(position);
            }
        });
        navController = Navigation.findNavController(view);

    }

    private void chooseFragment(int pos){
        switch (pos){
            case 0:

                setParams1(R.drawable.circuloarea, "Circulo", "Introduce el radio");
                navController.navigate(R.id.action_menuFragment_to_unCampoFragment);
                break;
            case 1:
                navController.navigate(R.id.action_menuFragment_to_trapecioFragment);
                break;
            case 2:
                setParams2(R.drawable.trianguloarea, "Triángulo", "Introduce la base",
                        "Introduce la altura");
                navController.navigate(R.id.action_menuFragment_to_dosCamposFragment);
                break;
            case 3:
                setParams2(R.drawable.romboarea, "Rombo", "Introduce D", "Introduce d");
                navController.navigate(R.id.action_menuFragment_to_unCampoFragment);
                break;
            case 4:
                setParams1(R.drawable.esferaarea, "Esfera", "Introduce el radio");
                navController.navigate(R.id.action_menuFragment_to_unCampoFragment);
                break;
            case 5:
                setParams1(R.drawable.cuadradoarea, "Cuadrado", "Introduce el lado");
                navController.navigate(R.id.unCampoFragment);
                break;
            case 6:
                setParams2(R.drawable.rectanguloarea, "Rectangulo", "Introduce la base",
                        "Introduce la altura");
                navController.navigate(R.id.action_menuFragment_to_dosCamposFragment);
                break;
            case 7:
                setParams1(R.drawable.cuboarea, "Cubo", "Introduce el lado");
                navController.navigate(R.id.action_menuFragment_to_dosCamposFragment);
                break;
            case 8:
                setParams2(R.drawable.cilindroarea, "Cilindro", "Introduce la base",
                        "Introduce la altura");
                navController.navigate(R.id.dosCamposFragment);
                break;
            case 9:
                setParams2(R.drawable.ovaloarea, "Óvalo", "Introduce R1", "Introduce R2");
                navController.navigate(R.id.action_menuFragment_to_dosCamposFragment);
                break;
        }
    }

    private void setParams1(int id, String titulo, String hint1){
        Mediador.setIdImagen(id);
        Mediador.setTitulo(titulo);
        Mediador.setHint1(hint1);
    }

    private void setParams2(int id, String titulo, String hint1, String hint2){
        Mediador.setIdImagen(id);
        Mediador.setTitulo(titulo);
        Mediador.setHint1(hint1);
        Mediador.setHint2(hint2);
    }

}