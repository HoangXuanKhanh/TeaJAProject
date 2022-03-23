package layoufavorite;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.teaja.R;

import java.util.List;

public class HiraganaAdapter extends RecyclerView.Adapter<HiraganaAdapter.HViewHolder> {
    List<Hiragana> hiraganaList;

    public void HiraganaAdapter(List<Hiragana> hiraganaList) {
        this.hiraganaList = hiraganaList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public HiraganaAdapter.HViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_hiragana, parent, false);
        HViewHolder hViewHolder = new HViewHolder(view);

        return hViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull HiraganaAdapter.HViewHolder holder, int position) {
        Hiragana hiragana = hiraganaList.get(position);

        holder.tvname1.setText(hiragana.getName1());
        holder.tvname2.setText(hiragana.getName2());
    }

    @Override
    public int getItemCount() {
        if (hiraganaList != null){
            return hiraganaList.size();
        }
        return 0;
    }

    public class HViewHolder extends RecyclerView.ViewHolder {

        private TextView tvname1;
        private TextView tvname2;

        public HViewHolder(@NonNull View itemView) {
            super(itemView);

            tvname1 = itemView.findViewById(R.id.tv_hiragana1);
            tvname2 = itemView.findViewById(R.id.tv_hiragana2);
        }
    }
}
