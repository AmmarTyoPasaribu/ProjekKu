public static void databaseToTable(){
        connection();
        try {
            String query = "SELECT NAMA, HARGA, JUMLAH FROM `tb_produk` ORDER BY ID DESC";            
            preparedStatement = connect.prepareStatement(query);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                String nama = resultSet.getString("NAMA");
                int harga = resultSet.getInt("HARGA");
                int jumlah = resultSet.getInt("JUMLAH");

                int index = jTable1.getRowCount();
         
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                model.addRow(new Object[]{
                index+=1,
                nama,
                harga, 
                jumlah,
            });
            }

            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
         
        }}