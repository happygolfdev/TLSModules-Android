package com.tlsolution.tlsmodulesexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tlsolution.tlsmodules.Inquery.Inquery
import com.tlsolution.tlsmodules.Inquery.InqueryManager
import com.tlsolution.tlsmodules.Notice.Notice
import com.tlsolution.tlsmodules.Notice.NoticeManager
import com.tlsolution.tlsmodules.Policy.Policy
import com.tlsolution.tlsmodules.Policy.PolicyManager
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class ExampleActivity : AppCompatActivity() {

    lateinit var noticeManager: NoticeManager
    lateinit var policyManager: PolicyManager
    lateinit var inqueryManager: InqueryManager

    private val content = "네이버 클라우드 플랫폼 서비스를 이용해주셔서 감사합니다. 당사는 정보통신망 이용촉진 및 정보보호 등에 관한 법률 제 30조의 2(개인정보 이용내역의 통지)에 따라, 고객님께서 네이버 클라우드 플랫폼에 제공하신 개인정보의 이용내역 현황을 알려 드립니다. 자세한 이용내역 현황은 아래와 같습니다. 1. 수집하는 개인정보의 항목 회사는 회원가입, 원활한 고객상담, 서비스 제공을 위해 최초 회원가입 당시 최소한의 개인정보를 수집하고자 하며 부가서비스 및 맞춤서비스 제공, 이벤트 응모 등을 위해 추가 수집이 필요한 경우 이용자 동의를 받고 있습니다. <개인 회원가입> - 필수항목: 이메일 주소, 비밀번호, 이름, 생년월일, 휴대폰 번호, 거주국가, 주소 <사업자 회원가입>네이버 클라우드 플랫폼 서비스를 이용해주셔서 감사합니다. 당사는 정보통신망 이용촉진 및 정보보호 등에 관한 법률 제 30조의 2(개인정보 이용내역의 통지)에 따라, 고객님께서 네이버 클라우드 플랫폼에 제공하신 개인정보의 이용내역 현황을 알려 드립니다. 자세한 이용내역 현황은 아래와 같습니다. 1. 수집하는 개인정보의 항목 회사는 회원가입, 원활한 고객상담, 서비스 제공을 위해 최초 회원가입 당시 최소한의 개인정보를 수집하고자 하며 부가서비스 및 맞춤서비스 제공, 이벤트 응모 등을 위해 추가 수집이 필요한 경우 이용자 동의를 받고 있습니다. <개인 회원가입> - 필수항목: 이메일 주소, 비밀번호, 이름, 생년월일, 휴대폰 번호, 거주국가, 주소 <사업자 회원가입>네이버 클라우드 플랫폼 서비스를 이용해주셔서 감사합니다. 당사는 정보통신망 이용촉진 및 정보보호 등에 관한 법률 제 30조의 2(개인정보 이용내역의 통지)에 따라, 고객님께서 네이버 클라우드 플랫폼에 제공하신 개인정보의 이용내역 현황을 알려 드립니다. 자세한 이용내역 현황은 아래와 같습니다. 1. 수집하는 개인정보의 항목 회사는 회원가입, 원활한 고객상담, 서비스 제공을 위해 최초 회원가입 당시 최소한의 개인정보를 수집하고자 하며 부가서비스 및 맞춤서비스 제공, 이벤트 응모 등을 위해 추가 수집이 필요한 경우 이용자 동의를 받고 있습니다. <개인 회원가입> - 필수항목: 이메일 주소, 비밀번호, 이름, 생년월일, 휴대폰 번호, 거주국가, 주소 <사업자 회원가입>네이버 클라우드 플랫폼 서비스를 이용해주셔서 감사합니다. 당사는 정보통신망 이용촉진 및 정보보호 등에 관한 법률 제 30조의 2(개인정보 이용내역의 통지)에 따라, 고객님께서 네이버 클라우드 플랫폼에 제공하신 개인정보의 이용내역 현황을 알려 드립니다. 자세한 이용내역 현황은 아래와 같습니다. 1. 수집하는 개인정보의 항목 회사는 회원가입, 원활한 고객상담, 서비스 제공을 위해 최초 회원가입 당시 최소한의 개인정보를 수집하고자 하며 부가서비스 및 맞춤서비스 제공, 이벤트 응모 등을 위해 추가 수집이 필요한 경우 이용자 동의를 받고 있습니다. <개인 회원가입> - 필수항목: 이메일 주소, 비밀번호, 이름, 생년월일, 휴대폰 번호, 거주국가, 주소 <사업자 회원가입>네이버 클라우드 플랫폼 서비스를 이용해주셔서 감사합니다. 당사는 정보통신망 이용촉진 및 정보보호 등에 관한 법률 제 30조의 2(개인정보 이용내역의 통지)에 따라, 고객님께서 네이버 클라우드 플랫폼에 제공하신 개인정보의 이용내역 현황을 알려 드립니다. 자세한 이용내역 현황은 아래와 같습니다. 1. 수집하는 개인정보의 항목 회사는 회원가입, 원활한 고객상담, 서비스 제공을 위해 최초 회원가입 당시 최소한의 개인정보를 수집하고자 하며 부가서비스 및 맞춤서비스 제공, 이벤트 응모 등을 위해 추가 수집이 필요한 경우 이용자 동의를 받고 있습니다. <개인 회원가입> - 필수항목: 이메일 주소, 비밀번호, 이름, 생년월일, 휴대폰 번호, 거주국가, 주소 <사업자 회원가입>네이버 클라우드 플랫폼 서비스를 이용해주셔서 감사합니다. 당사는 정보통신망 이용촉진 및 정보보호 등에 관한 법률 제 30조의 2(개인정보 이용내역의 통지)에 따라, 고객님께서 네이버 클라우드 플랫폼에 제공하신 개인정보의 이용내역 현황을 알려 드립니다. 자세한 이용내역 현황은 아래와 같습니다. 1. 수집하는 개인정보의 항목 회사는 회원가입, 원활한 고객상담, 서비스 제공을 위해 최초 회원가입 당시 최소한의 개인정보를 수집하고자 하며 부가서비스 및 맞춤서비스 제공, 이벤트 응모 등을 위해 추가 수집이 필요한 경우 이용자 동의를 받고 있습니다. <개인 회원가입> - 필수항목: 이메일 주소, 비밀번호, 이름, 생년월일, 휴대폰 번호, 거주국가, 주소 <사업자 회원가입>네이버 클라우드 플랫폼 서비스를 이용해주셔서 감사합니다. 당사는 정보통신망 이용촉진 및 정보보호 등에 관한 법률 제 30조의 2(개인정보 이용내역의 통지)에 따라, 고객님께서 네이버 클라우드 플랫폼에 제공하신 개인정보의 이용내역 현황을 알려 드립니다. 자세한 이용내역 현황은 아래와 같습니다. 1. 수집하는 개인정보의 항목 회사는 회원가입, 원활한 고객상담, 서비스 제공을 위해 최초 회원가입 당시 최소한의 개인정보를 수집하고자 하며 부가서비스 및 맞춤서비스 제공, 이벤트 응모 등을 위해 추가 수집이 필요한 경우 이용자 동의를 받고 있습니다. <개인 회원가입> - 필수항목: 이메일 주소, 비밀번호, 이름, 생년월일, 휴대폰 번호, 거주국가, 주소 <사업자 회원가입>"
    private val notices = arrayListOf<Notice>(Notice(1, "공지사항 제목입니다. (1)", content, Date()),
                                                Notice(2, "공지사항 제목입니다. (2)", content, Date()),
                                                Notice(3, "공지사항 제목입니다. (3)", content, Date()),
                                                Notice(4, "공지사항 제목입니다. (4)", content, Date()),
                                                Notice(5, "공지사항 제목입니다. (5)", content, Date()),
                                                Notice(6, "공지사항 제목입니다. (6)", content, Date()),
                                                Notice(7, "공지사항 제목입니다. (7)", content, Date()),
                                                Notice(8, "공지사항 제목입니다. (8)", content, Date()))

    private val policies = arrayListOf<Policy>(Policy("개인정보 취급방침", content, true),
                                                Policy("마케팅 사용동의(선택사항)", content, false),
                                                Policy("이용약관", content, true))

    private var inqueries = arrayListOf<Inquery>(
        Inquery(0, content, content, Date(), false),
        Inquery(1, content, content, Date(), false),
        Inquery(2, content, content, Date(), true),
        Inquery(3, content, content, Date(), true),
        Inquery(4, content, content, Date(), true),
        Inquery(5, content, content, Date(), true),
        Inquery(6, content, content, Date(), true)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        noticeManager = NoticeManager(this)
        noticeButton.setOnClickListener {
            noticeManager.launch(notices)
        }

        policyManager = PolicyManager(this)
        policyButton.setOnClickListener {
            policyManager.launch(policies)
        }

        inqueryManager = InqueryManager(this)
        inqueryButton.setOnClickListener {
            inqueryManager.launch(inqueries)
        }
        inqueryManager.newInqueryAction = { inquery ->
            val newInquery = Inquery(1, inquery, null, Date(), false)
            inqueries.add(0, newInquery)
            inqueryManager.completedOnNewInquery(inqueries)
        }

    }
}
