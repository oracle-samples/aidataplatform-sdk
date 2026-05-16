# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class UpdateKnowledgeBaseDetails(object):
    """
    The information to be updated.
    """

    #: A constant which can be used with the action property of a UpdateKnowledgeBaseDetails.
    #: This constant has a value of "METADATA_UPDATE"
    ACTION_METADATA_UPDATE = "METADATA_UPDATE"

    #: A constant which can be used with the action property of a UpdateKnowledgeBaseDetails.
    #: This constant has a value of "SOURCES_UPDATE"
    ACTION_SOURCES_UPDATE = "SOURCES_UPDATE"

    #: A constant which can be used with the action property of a UpdateKnowledgeBaseDetails.
    #: This constant has a value of "ADD_INDEX"
    ACTION_ADD_INDEX = "ADD_INDEX"

    #: A constant which can be used with the action property of a UpdateKnowledgeBaseDetails.
    #: This constant has a value of "DROP_INDEX"
    ACTION_DROP_INDEX = "DROP_INDEX"

    def __init__(self, **kwargs):
        """
        Initializes a new UpdateKnowledgeBaseDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param action:
            The value to assign to the action property of this UpdateKnowledgeBaseDetails.
            Allowed values for this property are: "METADATA_UPDATE", "SOURCES_UPDATE", "ADD_INDEX", "DROP_INDEX"
        :type action: str

        :param index_details:
            The value to assign to the index_details property of this UpdateKnowledgeBaseDetails.
        :type index_details: oci.aidataplatform_dp.models.KnowledgeBaseVectorIndexDetails

        :param update_knowledge_base_metadata_update_details:
            The value to assign to the update_knowledge_base_metadata_update_details property of this UpdateKnowledgeBaseDetails.
        :type update_knowledge_base_metadata_update_details: oci.aidataplatform_dp.models.UpdateKnowledgeBaseMetadataUpdateDetails

        :param update_knowledge_base_source_update_details:
            The value to assign to the update_knowledge_base_source_update_details property of this UpdateKnowledgeBaseDetails.
        :type update_knowledge_base_source_update_details: oci.aidataplatform_dp.models.UpdateKnowledgeBaseSourceUpdateDetails

        """
        self.swagger_types = {
            'action': 'str',
            'index_details': 'KnowledgeBaseVectorIndexDetails',
            'update_knowledge_base_metadata_update_details': 'UpdateKnowledgeBaseMetadataUpdateDetails',
            'update_knowledge_base_source_update_details': 'UpdateKnowledgeBaseSourceUpdateDetails'
        }

        self.attribute_map = {
            'action': 'action',
            'index_details': 'indexDetails',
            'update_knowledge_base_metadata_update_details': 'updateKnowledgeBaseMetadataUpdateDetails',
            'update_knowledge_base_source_update_details': 'updateKnowledgeBaseSourceUpdateDetails'
        }

        self._action = None
        self._index_details = None
        self._update_knowledge_base_metadata_update_details = None
        self._update_knowledge_base_source_update_details = None

    @property
    def action(self):
        """
        **[Required]** Gets the action of this UpdateKnowledgeBaseDetails.
        The update operation we want to perform on KnowledgeBase.

        Allowed values for this property are: "METADATA_UPDATE", "SOURCES_UPDATE", "ADD_INDEX", "DROP_INDEX"


        :return: The action of this UpdateKnowledgeBaseDetails.
        :rtype: str
        """
        return self._action

    @action.setter
    def action(self, action):
        """
        Sets the action of this UpdateKnowledgeBaseDetails.
        The update operation we want to perform on KnowledgeBase.


        :param action: The action of this UpdateKnowledgeBaseDetails.
        :type: str
        """
        allowed_values = ["METADATA_UPDATE", "SOURCES_UPDATE", "ADD_INDEX", "DROP_INDEX"]
        if not value_allowed_none_or_none_sentinel(action, allowed_values):
            raise ValueError(
                "Invalid value for `action`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._action = action

    @property
    def index_details(self):
        """
        Gets the index_details of this UpdateKnowledgeBaseDetails.

        :return: The index_details of this UpdateKnowledgeBaseDetails.
        :rtype: oci.aidataplatform_dp.models.KnowledgeBaseVectorIndexDetails
        """
        return self._index_details

    @index_details.setter
    def index_details(self, index_details):
        """
        Sets the index_details of this UpdateKnowledgeBaseDetails.

        :param index_details: The index_details of this UpdateKnowledgeBaseDetails.
        :type: oci.aidataplatform_dp.models.KnowledgeBaseVectorIndexDetails
        """
        self._index_details = index_details

    @property
    def update_knowledge_base_metadata_update_details(self):
        """
        Gets the update_knowledge_base_metadata_update_details of this UpdateKnowledgeBaseDetails.

        :return: The update_knowledge_base_metadata_update_details of this UpdateKnowledgeBaseDetails.
        :rtype: oci.aidataplatform_dp.models.UpdateKnowledgeBaseMetadataUpdateDetails
        """
        return self._update_knowledge_base_metadata_update_details

    @update_knowledge_base_metadata_update_details.setter
    def update_knowledge_base_metadata_update_details(self, update_knowledge_base_metadata_update_details):
        """
        Sets the update_knowledge_base_metadata_update_details of this UpdateKnowledgeBaseDetails.

        :param update_knowledge_base_metadata_update_details: The update_knowledge_base_metadata_update_details of this UpdateKnowledgeBaseDetails.
        :type: oci.aidataplatform_dp.models.UpdateKnowledgeBaseMetadataUpdateDetails
        """
        self._update_knowledge_base_metadata_update_details = update_knowledge_base_metadata_update_details

    @property
    def update_knowledge_base_source_update_details(self):
        """
        Gets the update_knowledge_base_source_update_details of this UpdateKnowledgeBaseDetails.

        :return: The update_knowledge_base_source_update_details of this UpdateKnowledgeBaseDetails.
        :rtype: oci.aidataplatform_dp.models.UpdateKnowledgeBaseSourceUpdateDetails
        """
        return self._update_knowledge_base_source_update_details

    @update_knowledge_base_source_update_details.setter
    def update_knowledge_base_source_update_details(self, update_knowledge_base_source_update_details):
        """
        Sets the update_knowledge_base_source_update_details of this UpdateKnowledgeBaseDetails.

        :param update_knowledge_base_source_update_details: The update_knowledge_base_source_update_details of this UpdateKnowledgeBaseDetails.
        :type: oci.aidataplatform_dp.models.UpdateKnowledgeBaseSourceUpdateDetails
        """
        self._update_knowledge_base_source_update_details = update_knowledge_base_source_update_details

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
