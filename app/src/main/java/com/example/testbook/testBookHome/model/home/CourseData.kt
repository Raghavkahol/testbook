package com.example.testbook.testBookHome.model.home

data class CourseData(
    val curTime: String? = null,
    val data: Data? = null,
    val success: Boolean? = null
)

data class Data(
    val classes: List<Info>? = null
)

data class Info(
    val _id: String? = null,
    val affiliateAttributionPaused: Boolean? = null,
    val availTill: String? = null,
    val classInfo: ClassInfo? = null,
    val classProperties: ClassProperties? = null,
    val coachingName: String? = null,
    val cost: Int? = null,
    val costUpfront: Boolean? = null,
    val course: Course? = null,
    val courseLogo: String? = null,
    val courses: List<CourseX>? = null,
    val createdOn: String? = null,
    val description: String? = null,
    val descriptions: Any? = null,
    val discountText: String? = null,
    val doubtTag: DoubtTag? = null,
    val extraFeatures: Any? = null,
    val features: Any? = null,
    val freeTestCount: Int? = null,
    val isClassCombo: Boolean? = null,
    val isCuratedTopic: Boolean? = null,
    val isCustom: Boolean? = null,
    val isDemoModuleAvail: Boolean? = null,
    val isHidden: Boolean? = null,
    val isOffer: Boolean? = null,
    val isPremium: Boolean? = null,
    val isRecommended: Boolean? = null,
    val items: Any? = null,
    val lastFreezedOn: String? = null,
    val lastUpdatedOn: String? = null,
    val minCost: Int? = null,
    val minPrice: Int? = null,
    val numPurchased: Int? = null,
    val offerEnd: String? = null,
    val offerStart: String? = null,
    val oldCost: Int? = null,
    val postNote: Any? = null,
    val publishCompleted: Boolean? = null,
    val quantity: Int? = null,
    val recommendedFor: String? = null,
    val releaseDate: String? = null,
    val shortDesc: Any? = null,
    val showSyllabus: Boolean? = null,
    val slugUrl: String? = null,
    val specificExams: List<SpecificExam>? = null,
    val stage: String? = null,
    val stopEvents: Boolean? = null,
    val summary: Summary? = null,
    val target: List<Target>? = null,
    val thumbnailInfo: ThumbnailInfo? = null,
    val title: String? = null,
    val titles: String? = null,
    val type: String? = null,
    val weight: Int? = null
)

data class ClassInfo(
    val classFeature: ClassFeature? = null,
    val courseSellingImage: String? = null,
    val facultiesImage: String? = null,
    val faqs: List<List<Faq>>? = null,
    val introVideoUrl: String? = null,
    val preRequisites: PreRequisites? = null,
    val subjectWiseSyllabus: SubjectWiseSyllabus? = null,
    val testimonials: List<Testimonial>? = null,
    val whyTakeThisCourse: WhyTakeThisCourse? = null
)

data class ClassProperties(
    val classType: ClassType? = null,
    val color: String? = null,
    val curriculum: Curriculum? = null,
    val instructors: List<Instructor>? = null,
    val languageInfo: String? = null,
    val languagesInfo: String? = null,
    val privateDiscussionUrl: String? = null,
    val seatsAvailsInfo: String? = null,
    val showLiveCourseTag: Boolean? = null,
    val subjects: List<Any>? = null
)

data class Course(
    val name: String? = null
)

data class CourseX(
    val id: String? = null,
    val name: String? = null
)

data class DoubtTag(
    val id: String? = null,
    val name: String? = null,
    val type: String? = null
)

data class SpecificExam(
    val id: String? = null,
    val name: String? = null
)

data class Summary(
    val module: Module? = null,
    val rating: Rating? = null
)

data class Target(
    val _id: String? = null,
    val isPrimary: Boolean? = null,
    val title: String? = null
)

data class ThumbnailInfo(
    val description: String? = null,
    val title: String? = null,
    val url: String? = null
)

data class ClassFeature(
    val features: List<Feature>? = null,
    val text: String? = null
)

data class Faq(
    val answer: String? = null,
    val language: String? = null,
    val question: String? = null
)

data class PreRequisites(
    val comments: List<String>? = null,
    val text: String? = null
)

data class SubjectWiseSyllabus(
    val comments: List<String>? = null,
    val text: String? = null
)

data class Testimonial(
    val image: String? = null,
    val name: String? = null,
    val rating: Double? = null,
    val review: String? = null
)

data class WhyTakeThisCourse(
    val comments: List<String>? = null,
    val text: String? = null
)

data class Feature(
    val count: Int? = null,
    val description: String? = null,
    val name: String? = null,
    val showInSummary: Boolean? = null,
    val title: String? = null,
    val type: String? = null
)

data class ClassType(
    val classFrom: String? = null,
    val classTill: String? = null,
    val lastEnrollmentDate: String? = null,
    val type: String? = null
)

data class Curriculum(
    val id: String? = null,
    val name: String? = null,
    val title: Any? = null,
    val url: Any? = null
)

data class Instructor(
    val fullBio: String? = null,
    val id: String? = null,
    val name: String? = null,
    val shortBio: String? = null
)

class Module(
)

class Rating(
)