package com.example.user.latihanfragmentdua;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentSkill extends Fragment {
    private Bundle bundle;
    private Pegawai pegawaiNyaa;
    private TextView txtNama3,txtAsalSekolah,txtKompetensi;


    public FragmentSkill() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view3 = inflater.inflate(R.layout.fragment_fragment_skill, container, false);
        txtNama3=(TextView) view3.findViewById(R.id.txt_nama);
        txtAsalSekolah=(TextView) view3.findViewById(R.id.txt_asalSekolah);
        txtKompetensi=(TextView) view3.findViewById(R.id.txt_kompetensi);
        return view3;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        txtNama3.setText(pegawaiNyaa.getNama());
        txtAsalSekolah.setText(pegawaiNyaa.getAsalSekolah());
        txtKompetensi.setText(pegawaiNyaa.getKompetensi());
    }

}
