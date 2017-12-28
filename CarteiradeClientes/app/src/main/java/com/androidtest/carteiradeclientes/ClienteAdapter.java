package com.androidtest.carteiradeclientes;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.androidtest.carteiradeclientes.dominio.entidades.Cliente;

import java.util.List;

/**
 * Created by Cleiton on 28/12/2017.
 */

public class ClienteAdapter extends RecyclerView.Adapter<ClienteAdapter.ViewHolderCliente>{

    private List<Cliente> dados;

    public ClienteAdapter(List<Cliente> dados){
        this.dados = dados;
    }

    @Override
    public ViewHolderCliente onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.linha_clientes, parent,false );

        ViewHolderCliente viewHolderCliente = new ViewHolderCliente(v);

        return viewHolderCliente;
    }

    @Override
    public void onBindViewHolder(ViewHolderCliente holder, int position) {

        if ((dados != null) && (dados.size()) > 0 ) {

            Cliente cliente = dados.get(position);

            holder.txtNome.setText(cliente.nome);
            holder.txtTelefone.setText(cliente.telefone);
        }
    }


    @Override
    public int getItemCount() {

        return dados.size();
    }


    //Aqui está private no original e não é estatica
    public static class ViewHolderCliente extends RecyclerView.ViewHolder{

        //no original os atributos estão publicos
        private TextView txtNome;
        private TextView txtTelefone;

        public ViewHolderCliente(View itemView) {
            super(itemView);

            txtNome = itemView.findViewById(R.id.txtNome);
            txtTelefone = itemView.findViewById(R.id.txtTelefone);

        }


    }


}