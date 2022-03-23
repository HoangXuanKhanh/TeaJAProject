package layoufavorite;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.teaja.R;
import com.example.teaja.myInterface.IClicItemCatalory1;

import java.util.List;

public class CataloryAdapterOne extends RecyclerView.Adapter<CataloryAdapterOne.ViewHolder> {
    List<Catalory1> catalory1List;
    IClicItemCatalory1 iClicItemCatalory1;

    public void CataloryAdapterOne(List<Catalory1> catalory1List, IClicItemCatalory1 catalory1) {
        this.catalory1List = catalory1List;
        this.iClicItemCatalory1 = catalory1;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public CataloryAdapterOne.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.iten_cataloryone, parent, false);
        ViewHolder viewHoler = new ViewHolder(view);

        return viewHoler;
    }

    @Override
    public void onBindViewHolder(@NonNull CataloryAdapterOne.ViewHolder holder, int position) {
        Catalory1 catalory1 = catalory1List.get(position);

        holder.imgCatalory1.setImageResource(catalory1.getResourceID1());
        holder.tvName1.setText(catalory1.getName1());
        holder.layoutCata1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iClicItemCatalory1.setOnClickItemListener1(catalory1);
            }
        });
    }

    @Override
    public int getItemCount() {
        if(catalory1List != null){
            return catalory1List.size();
        }
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView imgCatalory1;
        private TextView tvName1;
        private LinearLayout layoutCata1;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            layoutCata1 = itemView.findViewById(R.id.ln_Cata1);
            imgCatalory1 = itemView.findViewById(R.id.img_cataloryone);
            tvName1 = itemView.findViewById(R.id.tv_catalory1);
        }
    }

}
