package fonket.drinkquest;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import static android.R.attr.value;
import static android.R.attr.valueFrom;


public class ResultFragment extends Fragment {


    public ResultFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_result, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        TextView result = (TextView) view.findViewById(R.id.resulTv);
        String sex = getActivity().getIntent().getStringExtra("valueSex");
        int beer = getActivity().getIntent().getExtras().getInt("valueBeer");
        Log.d("RESULT", "el sexo es " + sex + "La cantidad de cervezas es " + beer);

        if (sex.contains("hombre")) {
            if (beer <= 3) {
                result.setText("Parece que mañana tienes una presentación. Esta bien resguardarse.");
            } else if (beer > 3 && beer <= 5) {
                result.setText("Eres el alma de la fiesta, todos esperan tu mejor talla.");
            } else if (beer > 5 && beer <= 7) {
                result.setText("Te gusta el desorden, ojalá fuese Viernes.");
            } else if (beer > 7) {
                result.setText("Eres el Genghis Kahn del trago.");
            }
        } else {
            if (beer <= 2) {
                result.setText("Es usted una lady, la compostura es la clave de su elegancia.");
            } else if (beer > 2 && beer <= 4) {
                result.setText("Eres la emperatriz del After Office.");
            } else if (beer > 4 && beer <= 6) {
                result.setText("No olvides poner la alarma. Y una botella de agua en el velador.");
            } else if (beer > 6) {
                result.setText("Eres la nueva Amy Winehouse.");


            }
        }
    }}

