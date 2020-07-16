package com.example.huytoapp

import android.os.Build
import android.os.Bundle
import android.text.Html
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_content_huyet.*

class ContentHuyetFragment : Fragment() {

    var dataContentHuyet: String? = null

    val contentHuyet = mapOf(
        "Trung Phủ" to "<p style=\"text-align: center;\"><strong>TRUNG PHỦ </strong><strong>中府 </strong><strong>PHẾ 1</strong></p>\n" +
                "<table width=\"1200\">\n" +
                "<tbody>\n" +
                "<tr>\n" +
                "<td colspan=\"2\" width=\"1200\">\n" +
                "<p><strong>&Yacute; NGHĨA ĐẶT T&Ecirc;N HUYỆT</strong></p>\n" +
                "<p><strong>TRUNG PHỦ </strong><strong>中府</strong><strong>: </strong><strong>中</strong>Trung- chỉ trung ti&ecirc;u+ <strong>府 </strong>Phủ-chỗ hội tụ.</p>\n" +
                "<p>Trung Phủ l&agrave; nơi hội tụ mạch kh&iacute; của kinh Phế. C&aacute;ch 2 hiểu: Do kinh Phế khởi từ trung ti&ecirc;u, huyệt l&agrave; nơi tập trung của kh&iacute; của trung ti&ecirc;u-Tỳ kh&iacute; Vị kh&iacute; đưa l&ecirc;n cho Phế.</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td colspan=\"2\" width=\"1200\">\n" +
                "<p><strong>VỊ TR&Iacute; HUYỆT</strong></p>\n" +
                "<p>C1: Giao điểm khoang li&ecirc;n sườn 2 v&agrave; r&atilde;nh delta ngực</p>\n" +
                "<p>C2: Giữa xương sườn 1 v&agrave; 2, c&aacute;ch đường giữa ngực 06 thốn.</p>\n" +
                "<p><strong>GIẢI PHẪU</strong></p>\n" +
                "<p>Dưới da l&agrave; cơ ngực to, cơ ngực b&eacute;, cơ răng cưa to, c&aacute;c cơ gian sườn 2. Thần kinh vận động cơ l&agrave; d&acirc;y thần kinh ngực to, d&acirc;y thần kinh ngực b&eacute;, d&acirc;y thần kinh răng to của đ&aacute;m rối thần kinh n&aacute;ch v&agrave; d&acirc;y thần kinh gian sườn 2.</p>\n" +
                "<p>Da v&ugrave;ng huyệt chi phối bởi tiết đoạn thần kinh C4.</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td colspan=\"2\" width=\"1200\">\n" +
                "<p><strong>ĐẶC T&Iacute;NH HUYỆT</strong></p>\n" +
                "<p><strong>Huyệt</strong> <strong>Mộ</strong> <strong>của</strong> <strong>Phế</strong><strong>: </strong>Trung Phủ cũng l&agrave; nơi m&agrave; tạng kh&iacute; kinh Phế tập tại ph&iacute;a trước-n&ecirc;n l&agrave; huyệt Mộ của Phế.</p>\n" +
                "<p><strong>Hội</strong> <strong>với</strong> <strong>Tỳ</strong><strong>. </strong></p>\n" +
                "<p><strong>Huyệt</strong> <strong>để</strong> <strong>tả</strong> <strong>Dương</strong><strong> ở </strong><strong>ngực</strong><strong>: </strong>V&igrave; l&agrave; nợi hội tụ của Phế kh&iacute; n&ecirc;n chuy&ecirc;n d&ugrave;ng để tả phế nhiệt v&agrave; chẩn đo&aacute;n suy nhược thần kinh.</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td width=\"930\">\n" +
                "<p><strong>C&Ocirc;NG DỤNG</strong></p>\n" +
                "<p>1, Chỉ kh&aacute;i b&igrave;nh suyễn, thanh phế h&oacute;a đ&agrave;m.</p>\n" +
                "<p>2, Thanh tuy&ecirc;n thượng ti&ecirc;u, sơ điều Phế kh&iacute;.</p>\n" +
                "<p>3, Huyệt để tả nhiệt t&agrave; ở ngực: phối hợp với Đại Cự, Khuyết Bồn v&agrave; Phong M&ocirc;n.</p>\n" +
                "</td>\n" +
                "<td width=\"270\">\n" +
                "<p><strong>CHỦ TRỊ-PHỐI HUYỆT</strong></p>\n" +
                "<p>Trị ho, hen suyễn, đau ngực, vai, lưng đau, vi&ecirc;m kh&iacute; quản, lao phổi.</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td width=\"930\">\n" +
                "<p>4, Huyệt quan trọng để chẩn đo&aacute;n suy nhược thần kinh. Theo thi&ecirc;n &lsquo;Đi&ecirc;n Cuồng&rsquo; (LKhu. 22): Nếu ấn ng&oacute;n tay tr&ecirc;n những huyệt Trung Phủ (P.1), V&acirc;n M&ocirc;n (P.2) v&agrave; Phế Du (Bq.13) bệnh nh&acirc;n cảm thấy kh&iacute; nghịch l&ecirc;n, v&agrave; nếu ấn mạnh hơn sẽ cảm thấy dễ chịu. Chứng minh do rối loạn vận h&agrave;nh n&ecirc;n đi&ecirc;n cuồng. V&igrave; thế, nếu rối loạn kh&iacute; k&egrave;m theo bụng trướng, bụng s&ocirc;i, ngực đ&egrave; &eacute;p kh&oacute; thở, phải ch&acirc;m 3 huyệt n&agrave;y.</p>\n" +
                "</td>\n" +
                "<td width=\"270\">&nbsp;</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td colspan=\"2\" width=\"1200\">\n" +
                "<p><strong>C&Aacute;CH CH&Acirc;M</strong></p>\n" +
                "<p>Ch&acirc;m thẳng 0, 3 &ndash; 0,5 thốn.</p>\n" +
                "<p>Ch&acirc;m hướng kim ra ngo&agrave;i, b&igrave;nh th&iacute;ch(ch&acirc;m xi&ecirc;n ngang) 0,5-0,8 thốn.</p>\n" +
                "<p>Cấm ch&acirc;m hướng kim v&agrave;o trong sẽ v&agrave;o tạng phế</p>\n" +
                "<p>Cứu 3 - 5 tr&aacute;ng - &Ocirc;n cứu 5-10 ph&uacute;t.</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "</tbody>\n" +
                "</table>",
        "Vân Môn" to "<p style=\"text-align: center;\"><strong>V&Acirc;N M&Ocirc;N </strong><strong>云门 </strong><strong>PHẾ 2</strong></p><table width=\"1200\">\n" +
                "<tbody>\n" +
                "<tr>\n" +
                "<td colspan=\"2\" width=\"1200\">\n" +
                "<p><strong>&Yacute; NGHĨA ĐẶT T&Ecirc;N HUYỆT</strong></p>\n" +
                "<p><strong>V&Acirc;N M&Ocirc;N </strong><strong>云门</strong><strong>: </strong><strong>云 </strong>V&acirc;n chỉ hơi nước + M&ocirc;n l&agrave; cửa ra v&agrave;o.</p>\n" +
                "<p>Nơi con người, Phế kh&iacute; gống như hơi nước ra v&agrave;o qua cửa, v&igrave; vậy gọi l&agrave; V&acirc;n M&ocirc;n (Trung Y Cương Mục).</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td colspan=\"2\" width=\"1200\">\n" +
                "<p><strong>VỊ TR&Iacute; HUYỆT</strong></p>\n" +
                "<p>Bờ dưới xương đ&ograve;n g&aacute;nh, nơi chỗ l&otilde;m ngang cơ ngực to, giữa cơ Delta, nơi c&oacute; gian sườn 1, c&aacute;ch đường ngực 06 thốn, tr&ecirc;n huyệt Trung Phủ 1, 6 thốn</p>\n" +
                "<p><strong>GIẢI PHẪU</strong></p>\n" +
                "<p>Dưới da l&agrave; r&atilde;nh cơ Delta ngực, cơ ngực to, cơ Delta, cơ dưới đ&ograve;n, cơ răng cưa to v&agrave; c&aacute;c cơ gian sườn 1.</p>\n" +
                "<p>Thần kinh vận động cơ l&agrave; d&acirc;y thần kinh ngực to, d&acirc;y thần kinh răng to, d&acirc;y thần kinh mũ, d&acirc;y thần kinh dưới đ&ograve;n, d&acirc;y thần kinh răng to của đ&aacute;m rối thần kinh n&aacute;ch v&agrave; d&acirc;y thần kinh gian sườn 1.</p>\n" +
                "<p>Da v&ugrave;ng huyệt chi phối bởi tiết đoạn thần kinh C4.</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td colspan=\"2\" width=\"1200\">\n" +
                "<p><strong>ĐẶC T&Iacute;NH HUYỆT</strong></p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td width=\"320\">\n" +
                "<p><strong>C&Ocirc;NG DỤNG</strong></p>\n" +
                "<p>1, Tuy&ecirc;n th&ocirc;ng Phế kh&iacute;.</p>\n" +
                "</td>\n" +
                "<td width=\"880\">\n" +
                "<p><strong>CHỦ TRỊ-PHỐI HUYỆT</strong></p>\n" +
                "<p><strong>CHỦ TRỊ </strong><strong>Trị</strong><strong> ho, </strong><strong>suyễn</strong><strong>, </strong><strong>ngực</strong> <strong>đầy</strong> <strong>tức</strong><strong>, </strong><strong>lưng</strong> <strong>đau</strong><strong>.</strong></p>\n" +
                "<p><strong>PHỐI HUYỆT:</strong></p>\n" +
                "<p>1, Phối Khuyết Bồn (Vi.12) trị vai đau kh&ocirc;ng đưa l&ecirc;n cao được (Gi&aacute;p Ất Kinh).</p>\n" +
                "<p>2, Phối Ẩn Bạch (Ty.1) + Hồn M&ocirc;n (Bq.47) + Kỳ M&ocirc;n (C.14) + Phế Du (Bq.13) + Trung Phủ (P.1) trị vai đau (Thi&ecirc;n Kim Phương).</p>\n" +
                "<p>3, Phối Bỉnh Phong (Ttr.12) trị vai đau (Tư Sinh Kinh).</p>\n" +
                "<p>4, Phối Chi C&acirc;u (Ttu.5) + Cực Tuyền (Tm.1) + Thi&ecirc;n Tr&igrave; (Tb.1) + Trung Phủ (P.1) trị cơ nhục bị phong thấp (Ch&acirc;m Cứu Học Thủ S&aacute;ch).</p>\n" +
                "<p>5, Phối Du Phủ (Th.27) + Nhũ Căn (Vi.18) trị suyễn (Phối Huyệt Kinh Lạc Giảng Nghĩa).</p>\n" +
                "<p>Thi&ecirc;n &lsquo;Thủy Nhiệt Huyệt Luận&rsquo; ghi: V&acirc;n M&ocirc;n (P.2) + Ngung Cốt (Ki&ecirc;n Ngung - Đtr.15) + Ủy Trung (Bq.40) + Tủy Kh&ocirc;ng (Y&ecirc;u Du - Đc.4), 8 huyệt n&agrave;y để tả nhiệt ở tứ chi (TVấn 61, 19).</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td colspan=\"2\" width=\"1200\">\n" +
                "<p><strong>C&Aacute;CH CH&Acirc;M</strong></p>\n" +
                "<p>Ch&acirc;m thẳng hoặc xi&ecirc;n, s&acirc;u 0, 5 - 1 thốn.</p>\n" +
                "<p>Cứu 3 - 5 tr&aacute;ng, &Ocirc;n cứu 5-10 ph&uacute;t.</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "</tbody>\n" +
                "</table>\n" +
                "<p>&nbsp;</p>",
        "Thiên Phủ" to "<p style=\"text-align: center;\"><strong>THI&Ecirc;N PHỦ </strong><strong>天府 </strong><strong>PHẾ 3</strong></p><table width=\"1200\">\n" +
                "<tbody>\n" +
                "<tr>\n" +
                "<td colspan=\"2\" width=\"1200\">\n" +
                "<p><strong>&Yacute; NGHĨA ĐẶT T&Ecirc;N HUYỆT</strong></p>\n" +
                "<p><strong>THI&Ecirc;N PHỦ </strong><strong>&nbsp;</strong><strong>天府</strong><strong>: </strong>Mũi l&agrave; khiếu của Phế. Phế th&ocirc;ng với thi&ecirc;n kh&iacute; qua mũi. Đối với con người, Phế l&agrave; phủ của kh&iacute;, v&igrave; vậy gọi l&agrave; Thi&ecirc;n Phủ (Trung Y Cương Mục).</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td colspan=\"2\" width=\"1200\">\n" +
                "<p><strong>VỊ TR&Iacute; HUYỆT</strong></p>\n" +
                "<p>Ở bờ trong bắp c&aacute;nh tay trong, dưới nếp n&aacute;ch trước 3 thốn nơi bờ ngo&agrave;i cơ 2 đầu c&aacute;nh tay, tr&ecirc;n huyệt X&iacute;ch Trạch (P.5) 6 thốn.</p>\n" +
                "<p><strong>GIẢI PHẪU</strong></p>\n" +
                "<p>Dưới da l&agrave; bờ ngo&agrave;i cơ 2 đầu c&aacute;nh tay, chỗ b&aacute;m của cơ c&aacute;nh tay trước v&agrave; cơ Delta, xương c&aacute;nh tay.</p>\n" +
                "<p>Thần kinh vận động cơ do c&aacute;c nh&aacute;nh của d&acirc;y thần kinh mũ v&agrave; d&acirc;y cơ-da.</p>\n" +
                "<p>Da v&ugrave;ng huyệt chi phối bởi tiết đoạn thần kinh C5.</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td colspan=\"2\" width=\"1200\">\n" +
                "<p><strong>ĐẶC T&Iacute;NH HUYỆT</strong></p>\n" +
                "<p>+ Một trong nh&oacute;m huyệt Thi&ecirc;n Dũ [Thi&ecirc;n Dũ Ngũ Bộ] (Nh&acirc;n Ngh&ecirc;nh (Vi.9) + Ph&ugrave; Đột (Đtr.18) + Thi&ecirc;n Dũ (Ttu.16) + Thi&ecirc;n Phủ (P.3) + Thi&ecirc;n Trụ (Bq.12) ), nhờ huyệt n&agrave;y m&agrave; kh&iacute; chuyển l&ecirc;n được phần tr&ecirc;n cơ thể.</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td width=\"320\">\n" +
                "<p><strong>C&Ocirc;NG DỤNG</strong></p>\n" +
                "<p>1, Tuy&ecirc;n th&ocirc;ng Phế kh&iacute;.</p>\n" +
                "</td>\n" +
                "<td width=\"880\">\n" +
                "<p><strong>CHỦ TRỊ-PHỐI HUYỆT</strong></p>\n" +
                "<p><strong>CHỦ TRỊ</strong></p>\n" +
                "<p>Trị suyễn, ho, chảy m&aacute;u cam, c&aacute;nh tay trong đau.</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td colspan=\"2\" width=\"1200\">\n" +
                "<p><strong>C&Aacute;CH CH&Acirc;M</strong></p>\n" +
                "<p>Ch&acirc;m thẳng s&acirc;u 0, 5 - 1 thốn. Cứu 3 - 5 tr&aacute;ng, &Ocirc;n cứu 5 - 10 ph&uacute;t.</p>\n" +
                "<p>Ghi Ch&uacute;: Cấm cứu (Gi&aacute;p Ất Kinh).</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "</tbody>\n" +
                "</table>",
        "Hiệp Bạch" to "<p style=\"text-align: center;\"><u><strong>HIỆP BẠCH</strong></u> <strong>俠白 </strong><strong>PHẾ 4</strong></p><table width=\"1200\">\n" +
                "<tbody>\n" +
                "<tr>\n" +
                "<td colspan=\"2\" width=\"1200\">\n" +
                "<p><strong>&Yacute; NGHĨA ĐẶT T&Ecirc;N HUYỆT</strong></p>\n" +
                "<p><strong>HIỆP BẠCH </strong><strong>俠白 </strong><strong>: </strong>Huyệt ở gần (hiệp) cơ nhị đầu c&aacute;nh tay, chỗ thịt mầu trắng (bạch), v&igrave; vậy, gọi l&agrave; Hiệp Bạch (Trung Y Cương Mục).</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td colspan=\"2\" width=\"1200\">\n" +
                "<p><strong>VỊ TR&Iacute; HUYỆT</strong></p>\n" +
                "<p>Ở mặt trong c&aacute;nh tay, nơi gặp nhau của bờ ngo&agrave;i cơ 2 đầu c&aacute;nh tay với đường ngang dưới nếp n&aacute;ch trước 4 thốn, tr&ecirc;n khớp khuỷ (X&iacute;ch Trạch) 5 thốn, dưới huyệt Thi&ecirc;n Phủ 1 thốn.</p>\n" +
                "<p><strong>GIẢI PHẪU</strong></p>\n" +
                "<p>Dưới da l&agrave; bờ ngo&agrave;i cơ 2 đầu c&aacute;nh tay, cơ c&aacute;nh tay trước v&agrave; bờ ngo&agrave;i xương c&aacute;nh tay.</p>\n" +
                "<p>Thần kinh vận động cơ l&agrave; c&aacute;c nh&aacute;nh của d&acirc;y thần kinh cơ da.</p>\n" +
                "<p>Da v&ugrave;ng huyệt chi phối bởi tiết đoạn thần kinh C3.</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td colspan=\"2\" width=\"1200\">\n" +
                "<p><strong>ĐẶC T&Iacute;NH HUYỆT</strong></p>\n" +
                "<p>Biệt của Th&aacute;i &Acirc;m (Gi&aacute;p Ất Kinh).</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td width=\"320\">\n" +
                "<p><strong>C&Ocirc;NG DỤNG</strong></p>\n" +
                "<p>1, Tuy&ecirc;n th&ocirc;ng Phế kh&iacute;.</p>\n" +
                "</td>\n" +
                "<td width=\"880\">\n" +
                "<p><strong>CHỦ TRỊ-PHỐI HUYỆT</strong></p>\n" +
                "<p><strong>CHỦ TRỊ</strong></p>\n" +
                "<p>Trị mặt trong c&aacute;nh tay đau, ho, ngực đau tức, hơi thở ngắn.</p>\n" +
                "<p><strong>Phối</strong> <strong>Huyệt</strong><strong>:</strong></p>\n" +
                "<p>1. Phối Kh&iacute;ch M&ocirc;n (Tb.4) + Gian Sử (Tb.5) + Nội Quan (Tb.6) + Thi&ecirc;n Tuyền (Tb.1) trị thần kinh giữa tay đau (Trung Quốc Ch&acirc;m Cứu Học).</p>\n" +
                "<p>2. Phối Thi&ecirc;n Phủ (P.3) trị tử điến phong, bạch điến phong (hắc l&agrave;o, ch&agrave;m...) (Tuần Kinh Ch&uacute;).</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td colspan=\"2\" width=\"1200\">\n" +
                "<p><strong>C&Aacute;CH CH&Acirc;M</strong></p>\n" +
                "<p>Ch&acirc;m thẳng 05 - 1 thốn. Cứu 3 - 5 tr&aacute;ng, &Ocirc;n cứu 5 - 10 ph&uacute;t.</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "</tbody>\n" +
                "</table>\n" +
                "<p>&nbsp;</p>",
        "Xích Trạch" to "<p style=\"text-align: center;\"><u><strong>X&Iacute;CH TRẠCH</strong></u><strong>:&nbsp; </strong><strong>尺澤 </strong><strong>PHẾ 5</strong></p><table width=\"1200\">\n" +
                "<tbody>\n" +
                "<tr>\n" +
                "<td colspan=\"2\" width=\"1200\">\n" +
                "<p><strong>&Yacute; NGHĨA ĐẶT T&Ecirc;N HUYỆT</strong></p>\n" +
                "<p><u><strong>X&Iacute;CH TRẠCH</strong></u><strong>:&nbsp; </strong><strong>尺澤 </strong>Huyệt ở chỗ trũng (giống c&aacute;i ao = trạch) c&aacute;ch lằn chỉ cổ tay 1 x&iacute;ch (đơn vị đo ng&agrave;y xưa), v&igrave; vậy gọi l&agrave; X&iacute;ch Trạch (Trung Y Cương Mục).</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td colspan=\"2\" width=\"1200\">\n" +
                "<p><strong>VỊ TR&Iacute; HUYỆT</strong></p>\n" +
                "<p>Gấp nếp khủy tay lại, huyệt ở chỗ l&otilde;m bờ ngo&agrave;i g&acirc;n cơ nhị đầu c&aacute;nh tay, bờ trong phần tr&ecirc;n cơ ngửa d&agrave;i, cơ c&aacute;nh tay trước.</p>\n" +
                "<p><strong>GIẢI PHẪU</strong></p>\n" +
                "<p>Dưới da l&agrave; bờ ngo&agrave;i g&acirc;n cơ 2 đầu c&aacute;nh tay, r&atilde;nh 2 đầu ngo&agrave;i, bờ trong gần tr&ecirc;n cơ ngửa d&agrave;i, cơ c&aacute;nh tay trước v&agrave; khớp khủy.</p>\n" +
                "<p>Thần kinh vận động cơ l&agrave; c&aacute;c nh&aacute;nh của thần kinh cơ-da v&agrave; thần kinh quay.</p>\n" +
                "<p>Da v&ugrave;ng huyệt chi phối bởi tiết đoạn thần kinh C6.</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td colspan=\"2\" width=\"1200\">\n" +
                "<p><strong>ĐẶC T&Iacute;NH HUYỆT</strong></p>\n" +
                "<p>+ Huyệt Hợp, thuộc h&agrave;nh Thuỷ.</p>\n" +
                "<p>+ Huyệt tả của kinh Phế</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td width=\"320\">\n" +
                "<p><strong>C&Ocirc;NG DỤNG</strong></p>\n" +
                "<p>Thanh nhiệt thượng ti&ecirc;u, gi&aacute;ng nghịch kh&iacute;, ti&ecirc;u trừ độc trong m&aacute;u, tiết Phế vi&ecirc;m.</p>\n" +
                "</td>\n" +
                "<td width=\"880\">\n" +
                "<p><strong>CHỦ TRỊ-PHỐI HUYỆT</strong></p>\n" +
                "<p><strong>CHỦ TRỊ</strong></p>\n" +
                "<p>Trị khủy tay đau, c&aacute;nh tay sưng đau, ho, suyễn, họng vi&ecirc;m, amiđan vi&ecirc;m, ho ra m&aacute;u.</p>\n" +
                "<p><strong><em>Phối</em></strong> <strong><em>Huyệt</em></strong><strong><em>:</em></strong></p>\n" +
                "<p><strong>1. </strong><strong>Phối</strong> <strong>Thiếu</strong> <strong>Trạch</strong><strong> (Ttr.1) </strong><strong>trị</strong> <strong>hụt</strong> <strong>hơi</strong><strong>, </strong><strong>h&ocirc;ng</strong> <strong>đau</strong><strong>, </strong><strong>t&acirc;m</strong> <strong>phiền</strong><strong> (</strong><strong>Thi&ecirc;n</strong><strong> Kim </strong><strong>Phương</strong><strong>).</strong></p>\n" +
                "<p><strong>2. </strong><strong>Phối</strong> <strong>C&aacute;ch</strong><strong> Du (Bq.17) + </strong><strong>Kinh</strong> <strong>M&ocirc;n</strong><strong> (Đ.25) + Y Hy (Bq.45) </strong><strong>trị</strong> <strong>vai</strong> <strong>lưng</strong> <strong>lạnh</strong><strong>, </strong><strong>trong</strong> <strong>bả</strong> <strong>vai</strong> <strong>đau</strong><strong> do </strong><strong>hư</strong><strong> (</strong><strong>Thi&ecirc;n</strong><strong> Kim </strong><strong>Phương</strong><strong>).</strong></p>\n" +
                "<p><strong>3. </strong><strong>Phối</strong> <strong>&Acirc;m</strong> <strong>Giao</strong><strong> (Nh.7) + </strong><strong>H&agrave;nh</strong><strong> Gian (C.2) + </strong><strong>Hợp</strong> <strong>Cốc</strong><strong> (Đtr.4) + </strong><strong>Kh&uacute;c</strong> <strong>Tr&igrave;</strong><strong> (Đtr.11) + Tam </strong><strong>&Acirc;m</strong> <strong>Giao</strong><strong> (Ty.6) + </strong><strong>Thủ</strong><strong> Tam </strong><strong>L&yacute;</strong><strong> (Đtr.10) + </strong><strong>T&uacute;c</strong><strong> Tam </strong><strong>L&yacute;</strong><strong> (Vi.36) </strong><strong>trị</strong> <strong>lưng</strong> <strong>đau</strong><strong> do </strong><strong>chấn</strong> <strong>thương</strong><strong>, </strong><strong>h&ocirc;ng</strong> <strong>sườn</strong> <strong>đau</strong><strong> (</strong><strong>Ch&acirc;m</strong> <strong>Cứu</strong> <strong>Tụ</strong><strong> Anh).</strong></p>\n" +
                "<p><strong>4. </strong><strong>Phối</strong> <strong>Thần</strong> <strong>M&ocirc;n</strong><strong> (Tm.7) </strong><strong>trị</strong> <strong>tay</strong> <strong>t&ecirc;</strong><strong> (</strong><strong>Ch&acirc;m</strong> <strong>Cứu</strong> <strong>Đại</strong> <strong>Th&agrave;nh</strong><strong>).</strong></p>\n" +
                "<p><strong>5. </strong><strong>Phối</strong> <strong>Hợp</strong> <strong>Cốc</strong><strong> (Đtr.4) + </strong><strong>Kh&uacute;c</strong> <strong>Tr&igrave;</strong><strong> (Đtr.11) </strong><strong>trị</strong> <strong>khủy</strong> <strong>tay</strong> <strong>sưng</strong> <strong>đau</strong> <strong>kh&ocirc;ng</strong> <strong>giơ</strong> <strong>l&ecirc;n</strong> <strong>được</strong><strong> (</strong><strong>Ch&acirc;m</strong> <strong>Cứu</strong> <strong>Đại</strong> <strong>Th&agrave;nh</strong><strong>).</strong></p>\n" +
                "<p><strong>6. </strong><strong>Phối</strong> <strong>Đại</strong> <strong>Lăng</strong><strong> (Tb.7) + Gian </strong><strong>Sử</strong><strong> (Tb.5) + </strong><strong>Tiểu</strong> <strong>Hải</strong><strong> (Ttr.8) </strong><strong>trị</strong> <strong>khủy</strong> <strong>tay</strong> <strong>sưng</strong> <strong>đau</strong><strong> (</strong><strong>Ch&acirc;m</strong> <strong>Cứu</strong> <strong>Đại</strong> <strong>Th&agrave;nh</strong><strong>).</strong></p>\n" +
                "<p><strong>7. </strong><strong>Phối</strong> <strong>Nh&acirc;n</strong> <strong>Trung</strong><strong> (Đc.26) + </strong><strong>Ủy</strong> <strong>Trung</strong><strong> (Bq.40) </strong><strong>trị</strong> <strong>lưng</strong> <strong>sườn</strong> <strong>đau</strong><strong> do </strong><strong>t&eacute;</strong> <strong>ng&atilde;</strong> <strong>tổn</strong> <strong>thương</strong><strong> (</strong><strong>Ch&acirc;m</strong> <strong>Cứu</strong> <strong>Đại</strong> <strong>Th&agrave;nh</strong><strong>).</strong></p>\n" +
                "<p><strong>8. </strong><strong>Phối</strong><strong> Chi </strong><strong>C&acirc;u</strong><strong> (Ttu.6) + </strong><strong>C&ocirc;n</strong> <strong>L&ocirc;n</strong><strong> (Bq.60) + </strong><strong>Dương</strong> <strong>Lăng</strong> <strong>Tuyền</strong><strong> (Đ.34) + </strong><strong>Nh&acirc;n</strong> <strong>Trung</strong><strong> (Đc.26) + </strong><strong>Th&uacute;c</strong> <strong>Cốt</strong><strong> (Bq.65) + </strong><strong>Ủy</strong> <strong>Trung</strong><strong> (Bq.40) </strong><strong>trị</strong> <strong>lưng</strong> <strong>đau</strong><strong> do </strong><strong>chấn</strong> <strong>thương</strong><strong> (</strong><strong>Ch&acirc;m</strong> <strong>Cứu</strong> <strong>Đại</strong> <strong>Th&agrave;nh</strong><strong>).</strong></p>\n" +
                "<p><strong>9. </strong><strong>Phối</strong> <strong>Kh&uacute;c</strong> <strong>Tr&igrave;</strong><strong> (Đtr.11) </strong><strong>trị</strong> <strong>khủy</strong> <strong>tay</strong><strong> co </strong><strong>r&uacute;t</strong><strong> (</strong><strong>Ngọc</strong><strong> Long Ca).</strong></p>\n" +
                "<p><strong>10. </strong><strong>Phối</strong> <strong>C&ocirc;n</strong> <strong>L&ocirc;n</strong><strong> (Bq.60) + </strong><strong>Dương</strong> <strong>Lăng</strong> <strong>Tuyền</strong><strong> (Đ.34) + </strong><strong>Hạ</strong> <strong>Li&ecirc;u</strong><strong> (Bq.34) + </strong><strong>Nh&acirc;n</strong> <strong>Trung</strong><strong> (Đc.26) + </strong><strong>Th&uacute;c</strong> <strong>Cốt</strong><strong> (Bq.65) + </strong><strong>Ủy</strong> <strong>Trung</strong><strong> (Bq.40) </strong><strong>trị</strong> <strong>lưng</strong> <strong>đau</strong><strong> do </strong><strong>tổn</strong> <strong>thương</strong><strong>, </strong><strong>kh&iacute;</strong> <strong>thống</strong><strong> (Y </strong><strong>Học</strong> <strong>Cương</strong> <strong>Mục</strong><strong>).</strong></p>\n" +
                "<p><strong>11. </strong><strong>Phối</strong> <strong>Đ&agrave;n</strong> <strong>Trung</strong><strong> (Nh.17) + </strong><strong>Phế</strong><strong> Du (Bq.13) + </strong><strong>Th&aacute;i</strong> <strong>Kh&ecirc;</strong><strong> (Th.3) </strong><strong>trị</strong><strong> ho </strong><strong>nhiệt</strong><strong> (</strong><strong>Thần</strong> <strong>Cứu</strong> <strong>Kinh</strong> <strong>Lu&acirc;n</strong><strong>).</strong></p>\n" +
                "<p><strong>12. </strong><strong>Phối</strong> <strong>&Acirc;m</strong> <strong>Giao</strong><strong> (Nh.7) + </strong><strong>&Acirc;m</strong> <strong>Lăng</strong> <strong>Tuyền</strong><strong> (Ty.9) + </strong><strong>H&agrave;nh</strong><strong> Gian (C.2) + </strong><strong>Hợp</strong> <strong>Cốc</strong><strong> (Đtr.4) + </strong><strong>Kh&uacute;c</strong> <strong>Tr&igrave;</strong><strong> (Đtr.11) + </strong><strong>Thủ</strong><strong> Tam </strong><strong>L&yacute;</strong><strong> (Đtr.10) + </strong><strong>T&uacute;c</strong><strong> Tam </strong><strong>L&yacute;</strong><strong> (Vi.36) </strong><strong>trị</strong> <strong>lưng</strong> <strong>v&agrave;</strong> <strong>h&ocirc;ng</strong> <strong>sườn</strong> <strong>đau</strong><strong> do </strong><strong>chấn</strong> <strong>thương</strong><strong> (</strong><strong>Thần</strong> <strong>Cứu</strong> <strong>Kinh</strong> <strong>Lu&acirc;n</strong><strong>).</strong></p>\n" +
                "<p><strong>13. </strong><strong>Phối</strong> <strong>Đại</strong> <strong>Ch&ugrave;y</strong><strong> (Đc.14) </strong><strong>thấu</strong> <strong>Kết</strong> <strong>Hạch</strong> <strong>Huyệt</strong><strong> + </strong><strong>Hoa</strong> <strong>C&aacute;i</strong><strong> (Nh.20) </strong><strong>thấu</strong> <strong>To&agrave;n</strong> <strong>Cơ</strong><strong> (Nh.21) </strong><strong>trị</strong><strong> lao </strong><strong>phổi</strong><strong> (</strong><strong>Ch&acirc;m</strong> <strong>Cứu</strong> <strong>Học</strong> <strong>Thượng</strong> <strong>Hải</strong><strong>).</strong></p>\n" +
                "<p><strong>14. </strong><strong>Phối</strong> <strong>Uỷ</strong> <strong>Trung</strong><strong> (Bq.40) [</strong><strong>xuất</strong> <strong>huyết</strong><strong>], </strong><strong>trị</strong> <strong>đơn</strong> <strong>độc</strong><strong>, </strong><strong>t&agrave;</strong> <strong>độc</strong> <strong>của</strong> <strong>thời</strong> <strong>kh&iacute;</strong><strong> (</strong><strong>dịch</strong><strong>) (</strong><strong>Ch&acirc;m</strong> <strong>Cứu</strong> <strong>Học</strong> <strong>Thượng</strong> <strong>Hải</strong><strong>).</strong></p>\n" +
                "<p><strong>15. </strong><strong>Phối</strong> <strong>B&aacute;</strong> <strong>Hội</strong><strong> (Đc.20) </strong><strong>c&oacute;</strong> <strong>t&aacute;c</strong> <strong>dụng</strong> <strong>thanh</strong> <strong>n&atilde;o</strong><strong>, </strong><strong>khai</strong> <strong>khiếu</strong><strong> (</strong><strong>Ch&acirc;m</strong> <strong>Cứu</strong> <strong>Học</strong> <strong>Thượng</strong> <strong>Hải</strong><strong>).</strong></p>\n" +
                "<p><strong>16. </strong><strong>Phối</strong> <strong>Thiếu</strong> <strong>Xung</strong><strong> (Tm.9) + </strong><strong>Trung</strong> <strong>Xung</strong><strong> (Tb.9) </strong><strong>c&oacute;</strong> <strong>t&aacute;c</strong> <strong>dụng</strong> <strong>định</strong> <strong>t&acirc;m</strong><strong>, an </strong><strong>thần</strong><strong> (</strong><strong>Ch&acirc;m</strong> <strong>Cứu</strong> <strong>Học</strong> <strong>Thượng</strong> <strong>Hải</strong><strong>).</strong></p>\n" +
                "<p><strong>17. </strong><strong>Phối</strong> <strong>Thi&ecirc;n</strong><strong> Xu (Vi.25) + </strong><strong>Trung</strong> <strong>Quản</strong><strong> (Nh.12) + </strong><strong>T&uacute;c</strong><strong> Tam </strong><strong>L&yacute;</strong><strong> (Vi.36) </strong><strong>c&oacute;</strong> <strong>t&aacute;c</strong> <strong>dụng</strong> <strong>tăng</strong> <strong>lực</strong> <strong>cho</strong> <strong>Vị</strong> <strong>kh&iacute;</strong><strong> (</strong><strong>Ch&acirc;m</strong> <strong>Cứu</strong> <strong>Học</strong> <strong>Thượng</strong> <strong>Hải</strong><strong>).</strong></p>\n" +
                "<p><strong>18. </strong><strong>Phối</strong> <strong>Thiếu</strong> <strong>Thương</strong><strong> (P.11) + </strong><strong>Thương</strong> <strong>Dương</strong><strong> (Đtr.1) </strong><strong>c&oacute;</strong> <strong>t&aacute;c</strong> <strong>dụng</strong> <strong>thanh</strong> <strong>nhiệt</strong><strong> ở </strong><strong>Phế</strong><strong>, </strong><strong>điều</strong> <strong>l&yacute;</strong> <strong>Trường</strong> <strong>Vị</strong><strong> (</strong><strong>Ch&acirc;m</strong> <strong>Cứu</strong> <strong>Học</strong> <strong>Thượng</strong> <strong>Hải</strong><strong>).</strong></p>\n" +
                "<p><strong>19. </strong><strong>Phối</strong><strong> Kim </strong><strong>T&acirc;n</strong><strong> + </strong><strong>Ngọc</strong> <strong>Dịch</strong> <strong>c&oacute;</strong> <strong>t&aacute;c</strong> <strong>dụng</strong> <strong>sinh</strong> <strong>t&acirc;n</strong> <strong>dịch</strong><strong> (</strong><strong>Phối</strong> <strong>Huyệt</strong> <strong>Kinh</strong> <strong>Lạc</strong> <strong>Giảng</strong> <strong>Nghĩa</strong><strong>).</strong></p>\n" +
                "<p><strong>20. </strong><strong>Phối</strong><strong> Cao Hoang (Bq.43) + </strong><strong>Đại</strong> <strong>Ch&ugrave;y</strong><strong> (Đc.14) + </strong><strong>Phế</strong><strong> Du (Bq.13) + Tam </strong><strong>&Acirc;m</strong> <strong>Giao</strong><strong> (Ty.6) + </strong><strong>Th&aacute;i</strong> <strong>Kh&ecirc;</strong><strong> (Th.3) </strong><strong>trị</strong><strong> lao </strong><strong>phổi</strong><strong> (</strong><strong>Tứ</strong> <strong>Bản</strong> <strong>Gi&aacute;o</strong> <strong>T&agrave;i</strong> <strong>Ch&acirc;m</strong> <strong>Cứu</strong> <strong>Học</strong><strong>).</strong></p>\n" +
                "<p><em>Tham</em> <em>Khảo</em><em>:</em></p>\n" +
                "<p>&ldquo;Phế tả X&iacute;ch Trạch bổ Th&aacute;i Uy&ecirc;n&rdquo;. Phế thực chứng, ch&acirc;m tả huyệt X&iacute;ch Trạch, v&igrave; Phế thuộc Kim. Bản huyệt (X&iacute;ch Trạch) thuộc h&agrave;nh Thủy, Kim sinh Thủy, Thủy l&agrave; &lsquo;tử&rsquo; (con) của Kim. X&iacute;ch Trạch l&agrave; &lsquo;tử&rsquo; huyệt của Phế Kinh. Thực th&igrave; tả &lsquo;tử&rsquo;. Tả X&iacute;ch Trạch để tả Phế Thực...&rdquo; (Thập Nhị Kinh Tử Mẫu Bổ Tả Ca).</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td colspan=\"2\" width=\"1200\">\n" +
                "<p><strong>C&Aacute;CH CH&Acirc;M</strong></p>\n" +
                "<p>Ch&acirc;m thẳng 0, 5 - 1 thốn - &Ocirc;n cứu 5 - 10 ph&uacute;t.</p>\n" +
                "<p><strong><em>Ghi</em></strong> <strong><em>Ch&uacute;</em></strong><strong><em>:</em></strong></p>\n" +
                "<p>(Nếu cứu, kh&ocirc;ng được cứu bỏng th&agrave;nh sẹo sẽ l&agrave;m hạn chế cử động.</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "</tbody>\n" +
                "</table>\n" +
                "<p>&nbsp;</p>",
        "Khổng Tối" to "<p style=\"text-align: center;\"><strong>KHỔNG TỐI: 孔最 PHẾ 6</strong></p>\n<table width=\"1200\">\n" +
                "<tbody>\n" +
                "<tr>\n" +
                "<td colspan=\"2\" width=\"1200\">\n" +
                "<p><strong>&Yacute; NGHĨA ĐẶT T&Ecirc;N HUYỆT</strong></p>\n" +
                "<p><u><strong>KHỔNG TỐI</strong></u><strong>: </strong><strong>孔最</strong><strong>: </strong>Huyệt c&oacute; t&aacute;c dụng th&ocirc;ng kh&iacute; l&ecirc;n mũi (tỵ khổng), l&agrave;m tuy&ecirc;n th&ocirc;ng Phế kh&iacute;, v&igrave; vậy được d&ugrave;ng trị c&aacute;c bệnh ở tỵ khổng (mũi), do đ&oacute;, gọi l&agrave; Khổng Tối (Trung Y Cương Mục).</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td colspan=\"2\" width=\"1200\">\n" +
                "<p><strong>VỊ TR&Iacute; HUYỆT</strong></p>\n" +
                "<p>Ở bờ ngo&agrave;i cẳng tay, tr&ecirc;n cổ tay 7 thốn, nơi gặp nhau của bờ trong cơ ngửa d&agrave;i hay bờ ngo&agrave;i của cơ gan tay to với đường ngang tr&ecirc;n khớp cổ tay 7 thốn, tr&ecirc;n đường thẳng nối huyệt X&iacute;ch Trạch (P.5) v&agrave; Th&aacute;i Uy&ecirc;n (P.9).</p>\n" +
                "<p><strong>GIẢI PHẪU</strong></p>\n" +
                "<p>Dưới da l&agrave; bờ trong cơ ngửa d&agrave;i, bờ ngo&agrave;i cơ gan tay to, cơ sấp tr&ograve;n, cơ gấp chung n&ocirc;ng c&aacute;c ng&oacute;n tay.</p>\n" +
                "<p>Thần kinh vận động cơ l&agrave; c&aacute;c nh&aacute;nh của d&acirc;y thần kinh giữa v&agrave; thần kinh quay.</p>\n" +
                "<p>Da v&ugrave;ng huyệt chi phối bởi tiết đoạn thần kinh C6.</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td colspan=\"2\" width=\"1200\">\n" +
                "<p><strong>ĐẶC T&Iacute;NH HUYỆT</strong></p>\n" +
                "<p>+ Huyệt thứ 6 của kinh Phế.</p>\n" +
                "<p>+ Huyệt Kh&iacute;ch của kinh Phế.</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td width=\"320\">\n" +
                "<p><strong>C&Ocirc;NG DỤNG</strong></p>\n" +
                "<p>Nhuận Phế, chỉ huyết, thanh nhiệt, giải biểu, điều gi&aacute;ng Phế kh&iacute;.</p>\n" +
                "</td>\n" +
                "<td width=\"880\">\n" +
                "<p><strong>CHỦ TRỊ-PHỐI HUYỆT</strong></p>\n" +
                "<p><strong>CHỦ TRỊ</strong></p>\n" +
                "<p>Trị tay v&agrave; khuỷu tay đau, ho, suyễn, amygdale vi&ecirc;m, phổi vi&ecirc;m, ho ra m&aacute;u.</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td colspan=\"2\" width=\"1200\">\n" +
                "<p><strong>C&Aacute;CH CH&Acirc;M</strong></p>\n" +
                "<p>Ch&acirc;m thẳng 0, 5- 1 thốn. Cứu 3 - 7 tr&aacute;ng, &Ocirc;n cứu 5 - 15 ph&uacute;t.</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "</tbody>\n" +
                "</table>\n" +
                "<p>&nbsp;</p>",
        "Liệt Khuyết" to "<p style=\"text-align: center;\"><u><strong>LIỆT KHUYẾT</strong></u><strong>:&nbsp; </strong><strong>列缺 </strong><strong>PHẾ 7</strong></p>\n" +
                "<table width=\"1200\">\n" +
                "<tbody>\n" +
                "<tr>\n" +
                "<td colspan=\"2\" width=\"1200\">\n" +
                "<p><strong>&Yacute; NGHĨA ĐẶT T&Ecirc;N HUYỆT</strong></p>\n" +
                "<p><u><strong>LIỆT KHUYẾT</strong></u><strong>:&nbsp; </strong><strong>列缺</strong><strong>: </strong>Liệt = t&aacute;ch ra. Khuyết = chỗ l&otilde;m. Huyệt ở tr&ecirc;n cổ tay, nơi c&oacute; chỗ l&otilde;m. Huyệt l&agrave; <strong>Lạc</strong> <strong>huyệt</strong> của kinh Phế, từ chỗ n&agrave;y c&oacute; 1 nh&aacute;nh t&aacute;ch ra để nối với kinh Đại Trường, v&igrave; vậy, gọi l&agrave; Liệt Khuyết (Trung Y Cương Mục) .</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td colspan=\"2\" width=\"1200\">\n" +
                "<p><strong>VỊ TR&Iacute; HUYỆT</strong></p>\n" +
                "<p>Dưới đầu xương quay nối với th&acirc;n xương, c&aacute;ch lằn chỉ ngang cổ tay 1, 5 thốn. Hoặc ch&eacute;o 2 ng&oacute;n tay tro? v&agrave; ng&oacute;n tay c&aacute;i cu?a 2 b&agrave;n tay với nhau, huyệt ở chỗ l&otilde;m ngay dưới đầu ng&oacute;n tay tro?.</p>\n" +
                "<p><strong>GIẢI PHẪU</strong></p>\n" +
                "<p>Dưới da l&agrave; bờ trong - trước của g&acirc;n cơ ngửa d&agrave;i, cơ gấp d&agrave;i ng&oacute;n c&aacute;i, chỗ b&aacute;m của cơ sấp vu&ocirc;ng v&agrave;o xương quay.</p>\n" +
                "<p>Thần kinh vận động cơ l&agrave; nh&aacute;nh của d&acirc;y thần kinh giữa.</p>\n" +
                "<p>Da v&ugrave;ng huyệt chi phối bởi tiết đoạn thần kinh C6.</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td colspan=\"2\" width=\"1200\">\n" +
                "<p><strong>ĐẶC T&Iacute;NH HUYỆT</strong></p>\n" +
                "<p>+ Huyệt thứ 7 của kinh Phế.</p>\n" +
                "<p>+ Huyệt Lạc, nơi ph&aacute;t xuất Lạc dọc, Lạc ngang.</p>\n" +
                "<p>+ Huyệt Giao hội với Nh&acirc;m Mạch.</p>\n" +
                "<p>+ 1 trong Lục Tổng Huyệt trị đau v&ugrave;ng đầu, g&aacute;y (C&agrave;n Kh&ocirc;n Sinh &Yacute;).</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td width=\"320\">\n" +
                "<p><strong>C&Ocirc;NG DỤNG</strong></p>\n" +
                "<p>Tuy&ecirc;n Phế, khu phong, th&ocirc;ng điều Nh&acirc;m Mạch.</p>\n" +
                "</td>\n" +
                "<td width=\"880\">\n" +
                "<p><strong>CHỦ TRỊ-PHỐI HUYỆT</strong></p>\n" +
                "<p><strong>CHỦ TRỊ</strong></p>\n" +
                "<p>Trị cổ tay đau sưng, đầu đau, cổ g&aacute;y cứng, ho, suyễn, liệt mặt.</p>\n" +
                "<p><strong><em>Tham</em></strong> <strong><em>Khảo</em></strong><strong><em>:</em></strong></p>\n" +
                "<p>(&ldquo;Trẻ nhỏ bị kinh phong, mắt trợn ngược: Liệt Khuyết chủ trị, đồng thời chọn huyệt Lạc của kinh Dương minh&rdquo; (Gi&aacute;p Ất Kinh).</p>\n" +
                "<p>(&ldquo; Kinh Dương Minh Đại Trường chạy dọc theo lỗ mũi, mặt đau, răng đau, m&aacute; sưng, mắt v&agrave;ng, miệng kh&ocirc;, mũi chảy nước, muic chảy m&aacute;u, họng sưng đau, ph&iacute;a trước vai đau chịu kh&ocirc;ng nổi. Ch&acirc;m huyệt Hợp Cốc + Liệt Khuyết&rdquo; (Thập Nhị Kinh Trị Chứng Chủ Kh&aacute;ch Nguy&ecirc;n Lạc Quyết).</p>\n" +
                "<p>(&ldquo;Liệt Khuyết phối hợp Hợp Cốc l&agrave; theo phương ph&aacute;p &lsquo;Phối Hợp Nguy&ecirc;n - Lạc&rsquo;, &lsquo;Phối Hợp Chủ - Kh&aacute;ch&rsquo;, lấy phối hợp theo Tạng Phủ, Kinh Lạc. D&ugrave;ng ph&eacute;p tả 2 huyệt n&agrave;y, thường để trị ngoại cảm biểu chứng [phong h&agrave;n, phong nhiệt nhập Phế hoặc bệnh ở Phế vệ] (Thường Dụng Du Huyệt L&acirc;m S&agrave;ng Ph&aacute;t Huy).</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td colspan=\"2\" width=\"1200\">\n" +
                "<p><strong>C&Aacute;CH CH&Acirc;M</strong></p>\n" +
                "<p>Ch&acirc;m xi&ecirc;n, hướng mũi kim v&agrave;o khớp c&ugrave;i chỏ, s&acirc;u 0, 5 - 1 thốn, &Ocirc;n cứu 5 - 10 ph&uacute;t.</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "</tbody>\n" +
                "</table>",
        "Kinh Cừ" to "<p style=\"text-align: center;\"><u><strong>KINH CỪ</strong></u><strong>: </strong><strong>經渠 </strong><strong>PHẾ 8</strong></p>\n" +
                "<table width=\"1200\">\n" +
                "<tbody>\n" +
                "<tr>\n" +
                "<td colspan=\"2\" width=\"1200\">\n" +
                "<p><strong>&Yacute; NGHĨA ĐẶT T&Ecirc;N HUYỆT</strong></p>\n" +
                "<p><u><strong>KINH CỪ</strong></u><strong>: </strong><strong>經渠</strong><strong>: </strong>Huyệt nằm ở r&atilde;nh (cừ) mạch quay v&agrave; g&acirc;n cơ tay, giống như c&aacute;i rạch ở giữa 2 đường kinh, v&igrave; vậy gọi l&agrave; Kinh Cừ.</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td colspan=\"2\" width=\"1200\">\n" +
                "<p><strong>VỊ TR&Iacute; HUYỆT</strong></p>\n" +
                "<p>Tr&ecirc;n lằn chỉ cổ tay 1 thốn, ở mặt trong đầu dưới xương quay.</p>\n" +
                "<p>&nbsp;<strong>GIẢI PHẪU</strong></p>\n" +
                "<p>Dưới da l&agrave; r&atilde;nh mạch quay. R&atilde;nh tạo n&ecirc;n bởi g&acirc;n cơ ngửa d&agrave;i v&agrave; mặt trong đầu dưới xương quay (ở ngo&agrave;i), g&acirc;n cơ gan tay to v&agrave; g&acirc;n cơ gấp chung n&ocirc;ng (ở trong), g&acirc;n cơ gấp ri&ecirc;ng ng&oacute;n tay c&aacute;i v&agrave; cơ sấp vu&ocirc;ng (ở đ&aacute;y r&atilde;nh).</p>\n" +
                "<p>Thần kinh vận động cơ l&agrave; c&aacute;c nh&aacute;nh của d&acirc;y thần kinh giữa v&agrave; d&acirc;y thần kinh quay.</p>\n" +
                "<p>Da v&ugrave;ng huyệt chi phối bởi tiết đoạn thần kinh C6.</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td colspan=\"2\" width=\"1200\">\n" +
                "<p><strong>ĐẶC T&Iacute;NH HUYỆT</strong></p>\n" +
                "<p>+ Huyệt thứ 8 của kinh Phế.</p>\n" +
                "<p>+ Huyệt Kinh, thuộc h&agrave;nh Kim.</p>\n" +
                "<p>+ Huyệt quan trọng để ph&aacute;t h&atilde;n.</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td width=\"320\">\n" +
                "<p><strong>C&Ocirc;NG DỤNG</strong></p>\n" +
                "</td>\n" +
                "<td width=\"880\">\n" +
                "<p><strong>CHỦ TRỊ-PHỐI HUYỆT</strong></p>\n" +
                "<p><strong>CHỦ TRỊ</strong></p>\n" +
                "<p>Trị b&agrave;n tay v&agrave; cổ tay đau, ngực đau, họng đau, ho, suyễn.</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td colspan=\"2\" width=\"1200\">\n" +
                "<p><strong>C&Aacute;CH CH&Acirc;M</strong></p>\n" +
                "<p>Ch&acirc;m thẳng hoặc xi&ecirc;n 0, 3 - 0, 5 thốn - &Ocirc;n cứu 3 - 5 thốn.</p>\n" +
                "<p><strong><em>Ghi</em></strong> <strong><em>Ch&uacute;</em></strong><strong><em>:</em></strong></p>\n" +
                "<p>(Tr&aacute;nh ch&acirc;m s&acirc;u v&agrave;o xương v&agrave; động mạch.</p>\n" +
                "<p>(&ldquo; Kh&ocirc;ng cứu v&igrave; c&oacute; thể a?nh hưởng đến thần minh&rdquo; (Gi&aacute;p Ất Kinh).</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "</tbody>\n" +
                "</table>",
        "Thái Uyên" to "<p style=\"text-align: center;\"><u><strong>TH&Aacute;I UY&Ecirc;N</strong></u><strong>: </strong><strong>太淵 </strong><strong>PHẾ 9</strong></p>\n" +
                "<table width=\"1200\">\n" +
                "<tbody>\n" +
                "<tr>\n" +
                "<td colspan=\"2\" width=\"1200\">\n" +
                "<p><strong>&Yacute; NGHĨA ĐẶT T&Ecirc;N HUYỆT</strong></p>\n" +
                "<p><u><strong>TH&Aacute;I UY&Ecirc;N</strong></u><strong>: </strong><strong>太淵</strong><strong>: </strong>Khi hơi co b&agrave;n tay v&agrave;o ph&iacute;a cẳng tay, tại bờ ngo&agrave;i lằn chỉ cổ tay, gần xương tay quay, tạo th&agrave;nh 1 chỗ rất (th&aacute;i) l&otilde;m, như 1 c&aacute;i hố s&acirc;u (uy&ecirc;n), v&igrave; vậy, gọi l&agrave; Th&aacute;i Uy&ecirc;n.</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td colspan=\"2\" width=\"1200\">\n" +
                "<p><strong>VỊ TR&Iacute; HUYỆT</strong></p>\n" +
                "<p>Tr&ecirc;n lằn chỉ ngang cổ tay, nơi chỗ l&otilde;m tr&ecirc;n động mạch tay quay, dưới huyệt l&agrave; r&atilde;nh mạch tay quay</p>\n" +
                "<p>&nbsp;<strong>GIẢI PHẪU</strong></p>\n" +
                "<p>Dưới da l&agrave; r&atilde;nh mạch quay. R&atilde;nh ở đoạn n&agrave;y cấu tạo bởi g&acirc;n cơ dạng d&agrave;i v&agrave; g&acirc;n cơ duỗi ngắn ng&oacute;n tay c&aacute;i (ở ngo&agrave;i). G&acirc;n cơ gang tay to v&agrave; g&acirc;n cơ gấp chung n&ocirc;ng c&aacute;c ng&oacute;n tay (ở trong). G&acirc;n cơ gấp d&agrave;i ng&oacute;n tay c&aacute;i v&agrave; xương thuyền (ở đ&aacute;y).</p>\n" +
                "<p>Thần kinh vận động cơ l&agrave; c&aacute;c nh&aacute;nh của d&acirc;y thần kinh giữa v&agrave; d&acirc;y thần kinh quay.</p>\n" +
                "<p>Da v&ugrave;ng huyệt chi phối bởi tiết đoạn thần kinh C6.</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td colspan=\"2\" width=\"1200\">\n" +
                "<p><strong>ĐẶC T&Iacute;NH HUYỆT</strong></p>\n" +
                "<p>+ Huyệt thứ 9 của kinh Phế.</p>\n" +
                "<p>+ Huyệt Du - Nguy&ecirc;n, thuộc h&agrave;nh Thổ.</p>\n" +
                "<p>+ Huyệt Hội của Mạch.</p>\n" +
                "<p>+ Huyệt Bổ của kinh Phế.</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td width=\"320\">\n" +
                "<p><strong>C&Ocirc;NG DỤNG</strong></p>\n" +
                "<p>Khu phong, h&oacute;a đ&agrave;m, l&yacute; phế, chỉ kh&aacute;t.</p>\n" +
                "</td>\n" +
                "<td width=\"880\">\n" +
                "<p><strong>CHỦ TRỊ-PHỐI HUYỆT</strong></p>\n" +
                "<p><strong>CHỦ TRỊ</strong></p>\n" +
                "<p>Trị ngực đau, lưng v&agrave; vai đau, quanh khớp cổ tay đau, ho suyễn.</p>\n" +
                "<p><strong><em>Tham</em></strong> <strong><em>Khảo</em></strong><strong><em>:</em></strong></p>\n" +
                "<p>(&ldquo;Thi&ecirc;n &lsquo;Nhiệt Bệnh&rsquo; ghi: &ldquo;Nhiệt bệnh mồ h&ocirc;i vẫn ra m&agrave; mạch lại thuận, c&oacute; thể ch&acirc;m cho ra mồ h&ocirc;i, n&ecirc;n thủ huyệt Ngư Tế (P.10), Th&aacute;i Uy&ecirc;n (P.9), Đại Đ&ocirc; (Ty.2), Th&aacute;i Bạch [Ty.3], ch&acirc;m tả c&aacute;c huyệt n&agrave;y sẽ l&agrave;m cho nhiệt giảm bớt, ch&acirc;m bổ th&igrave; ra mồ h&ocirc;i (LKhu.23, 30).</p>\n" +
                "<p>(&ldquo;Thi&ecirc;n &lsquo;Quyết Bệnh&rsquo; ghi: &ldquo;Chứng Quyết t&acirc;m thống, nếu nằm hoặc nh&agrave;n rỗi th&igrave; T&acirc;m thống được gi&atilde;n, bớt, khi n&agrave;o hoạt động th&igrave; đau nhiều hơn, kh&ocirc;ng biến sắc mặt, gọi l&agrave; chứng &lsquo;Phế T&acirc;m thống&rsquo;, thủ huyệt Ngư Tế, Đại Uy&ecirc;n&rdquo; (LKhu 24, 15).</p>\n" +
                "<p>(&ldquo;Phế chủ, Đại trường kh&aacute;ch : Th&aacute;i &acirc;m nhiều kh&iacute; &iacute;t huyết, ngực tức, l&ograve;ng b&agrave;n tay n&oacute;ng, ho suyễn, v&ugrave;ng khuyết bồn đau, kh&oacute; chịu, cuống họng kh&ocirc; đau, mồ h&ocirc;i ra, ph&iacute;a trước vai v&agrave; 2 v&uacute; đau, đờm kết ở ngực, hụt hơi. Sở sinh bệnh t&igrave;m huyệt g&igrave;? Bảo rằng huyệt Th&aacute;i Uy&ecirc;n + Thi&ecirc;n Lịch [Đtr.6]&rdquo; (Thập nhị Kinh Trị Chứng Chủ Kh&aacute;ch Nguy&ecirc;n Lạc).</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td colspan=\"2\" width=\"1200\">\n" +
                "<p><strong>C&Aacute;CH CH&Acirc;M</strong></p>\n" +
                "<p>Ch&acirc;m thẳng, từ mặt trong l&ograve;ng b&agrave;n tay, hướng mũi kim tới mặt ph&iacute;a lưng b&agrave;n tay, s&acirc;u 0, 3 - 0, 5 thốn, &Ocirc;n cứu 3 - 5 ph&uacute;t.</p>\n" +
                "<p><strong>Ghi</strong> <strong>ch&uacute;</strong><strong>:&nbsp;</strong>Tr&aacute;nh ch&acirc;m v&agrave;o động mạch v&agrave; xương.</p>\n" +
                "</td>\n" +
                "</tr>\n" +
                "</tbody>\n" +
                "</table>"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            dataContentHuyet = it?.getString("tenHuyet")
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_content_huyet, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            textContentHuyet.setText(
                Html.fromHtml(
                    contentHuyet[dataContentHuyet.toString() ?: ""],
                    Html.FROM_HTML_MODE_COMPACT
                )
            );
        } else {
            textContentHuyet.setText(
                Html.fromHtml(
                    contentHuyet[dataContentHuyet.toString() ?: ""]
                )
            );
        }

    }


    companion object {
        @JvmStatic
        fun newInstance() = ContentHuyetFragment()
    }
}