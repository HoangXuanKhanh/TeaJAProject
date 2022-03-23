package layoufavorite;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.teaja.R;

import java.util.List;

public class kataganaAdapter extends RecyclerView.Adapter<kataganaAdapter.KTViewHolder> {

    List<Katagana> kataganaList;

    public void kataganaAdapter(List<Katagana> kataganaList) {
        this.kataganaList = kataganaList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public kataganaAdapter.KTViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_katakana, parent, false);
        KTViewHolder ktViewHolder = new KTViewHolder(view);

        return ktViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull kataganaAdapter.KTViewHolder holder, int position) {
        Katagana katagana = kataganaList.get(position);

        holder.tvname1.setText(katagana.getName1());
        holder.tvname2.setText(katagana.getName2());
    }

    @Override
    public int getItemCount() {
        if (kataganaList != null){
            return kataganaList.size();
        }
        return 0;
    }

    public class KTViewHolder extends RecyclerView.ViewHolder {
        private TextView tvname1;
        private TextView tvname2;
        public KTViewHolder(@NonNull View itemView) {
            super(itemView);
            tvname1 = itemView.findViewById(R.id.tv_katakana1);
            tvname2 = itemView.findViewById(R.id.tv_katakana2);
        }
    }
}
