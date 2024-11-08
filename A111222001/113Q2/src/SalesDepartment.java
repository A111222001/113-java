import java.util.Scanner;

public class SalesDepartment {
    public  static void main(String args[]) {
        SalesPerson[] salesTeam = new SalesPerson[3];
        SalesPerson sales1 = new SalesPerson("SE111", "林俊傑");
        SalesPerson sales2 = new SalesPerson("SE222", "張佳豪");
        SalesPerson sales3 = new SalesPerson("SE333", "劉威廷");
        salesTeam[0] = sales1;
        salesTeam[1] = sales2;
        salesTeam[2] = sales3;
        operation(salesTeam);
    }

    public static void operation(SalesPerson[] salesTeam) {
        SalesPerson targetSales;
        Scanner input = new Scanner(System.in);
        menu();

        while (input.hasNext()) {
            int choice = input.nextInt();
            try {
                switch (choice) {
                    case 1:  // 設定銷售金額
                        targetSales = selectedSales(salesTeam);  // 選擇業務員
                        if (targetSales != null) {
                            System.out.print("請輸入銷售金額： ");
                            double grossSales = input.nextDouble();
                            targetSales.setGrossSales(grossSales);  // 設定銷售金額
                        }
                        break;

                    case 2:  // 設定獎金比例
                        targetSales = selectedSales(salesTeam);  // 選擇業務員
                        if (targetSales != null) {
                            System.out.print("請輸入獎金比例（0.0 到 1.0 之間）： ");
                            double commissionRate = input.nextDouble();
                            targetSales.setCommissionRate(commissionRate);  // 設定獎金比例
                        }
                        break;

                    case 3:  // 薪資查詢
                        targetSales = selectedSales(salesTeam);  // 選擇業務員
                        if (targetSales != null) {
                            System.out.println("薪資查詢結果：");
                            System.out.println(targetSales.toString());  // 顯示該業務員的資訊
                        }
                        break;

                    default:
                        System.out.println("選項錯誤，請重新輸入！");
                        break;
                }
            }
            catch (IllegalArgumentException ex) {
                menu();
                continue;
            }
            menu();
        }
        for (SalesPerson s : salesTeam)
            System.out.print(s.toString());
    }

    public static SalesPerson selectedSales(SalesPerson[] salesTeam) {
        Scanner input = new Scanner(System.in);
        System.out.print("請輸入編號： ");
        String salesID = input.next();

        // 從salesTeam陣列中搜尋對應的銷售員
        for (SalesPerson sales : salesTeam) {
            if (sales.getId().equals(salesID)) {
                return sales;  // 如果找到，回傳該業務員
            }
        }

        System.out.println("編號輸入錯誤");
        return null;
    }

    public static void menu() {
        System.out.println("\n\nROC股份有限公司：");
        System.out.print("1.設定銷售金額\n2.設定獎金比例\n3.薪資查詢\n請輸入： ");
    }
}
