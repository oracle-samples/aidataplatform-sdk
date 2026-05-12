# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class UpdateKnowledgeBaseSourceUpdateDetailsItem(object):
    """
    The information to be updated for KnowledgeBase source.
    """

    #: A constant which can be used with the action property of a UpdateKnowledgeBaseSourceUpdateDetailsItem.
    #: This constant has a value of "ADD_SOURCE"
    ACTION_ADD_SOURCE = "ADD_SOURCE"

    #: A constant which can be used with the action property of a UpdateKnowledgeBaseSourceUpdateDetailsItem.
    #: This constant has a value of "DELETE_SOURCE"
    ACTION_DELETE_SOURCE = "DELETE_SOURCE"

    def __init__(self, **kwargs):
        """
        Initializes a new UpdateKnowledgeBaseSourceUpdateDetailsItem object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param action:
            The value to assign to the action property of this UpdateKnowledgeBaseSourceUpdateDetailsItem.
            Allowed values for this property are: "ADD_SOURCE", "DELETE_SOURCE"
        :type action: str

        :param update_knowledge_base_add_source_details:
            The value to assign to the update_knowledge_base_add_source_details property of this UpdateKnowledgeBaseSourceUpdateDetailsItem.
        :type update_knowledge_base_add_source_details: oci.aidataplatform_dp.models.UpdateKnowledgeBaseAddSourceDetails

        :param update_knowledge_base_delete_source_details:
            The value to assign to the update_knowledge_base_delete_source_details property of this UpdateKnowledgeBaseSourceUpdateDetailsItem.
        :type update_knowledge_base_delete_source_details: oci.aidataplatform_dp.models.UpdateKnowledgeBaseDeleteSourceDetails

        """
        self.swagger_types = {
            'action': 'str',
            'update_knowledge_base_add_source_details': 'UpdateKnowledgeBaseAddSourceDetails',
            'update_knowledge_base_delete_source_details': 'UpdateKnowledgeBaseDeleteSourceDetails'
        }

        self.attribute_map = {
            'action': 'action',
            'update_knowledge_base_add_source_details': 'updateKnowledgeBaseAddSourceDetails',
            'update_knowledge_base_delete_source_details': 'updateKnowledgeBaseDeleteSourceDetails'
        }

        self._action = None
        self._update_knowledge_base_add_source_details = None
        self._update_knowledge_base_delete_source_details = None

    @property
    def action(self):
        """
        **[Required]** Gets the action of this UpdateKnowledgeBaseSourceUpdateDetailsItem.
        Source update action type

        Allowed values for this property are: "ADD_SOURCE", "DELETE_SOURCE"


        :return: The action of this UpdateKnowledgeBaseSourceUpdateDetailsItem.
        :rtype: str
        """
        return self._action

    @action.setter
    def action(self, action):
        """
        Sets the action of this UpdateKnowledgeBaseSourceUpdateDetailsItem.
        Source update action type


        :param action: The action of this UpdateKnowledgeBaseSourceUpdateDetailsItem.
        :type: str
        """
        allowed_values = ["ADD_SOURCE", "DELETE_SOURCE"]
        if not value_allowed_none_or_none_sentinel(action, allowed_values):
            raise ValueError(
                "Invalid value for `action`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._action = action

    @property
    def update_knowledge_base_add_source_details(self):
        """
        Gets the update_knowledge_base_add_source_details of this UpdateKnowledgeBaseSourceUpdateDetailsItem.

        :return: The update_knowledge_base_add_source_details of this UpdateKnowledgeBaseSourceUpdateDetailsItem.
        :rtype: oci.aidataplatform_dp.models.UpdateKnowledgeBaseAddSourceDetails
        """
        return self._update_knowledge_base_add_source_details

    @update_knowledge_base_add_source_details.setter
    def update_knowledge_base_add_source_details(self, update_knowledge_base_add_source_details):
        """
        Sets the update_knowledge_base_add_source_details of this UpdateKnowledgeBaseSourceUpdateDetailsItem.

        :param update_knowledge_base_add_source_details: The update_knowledge_base_add_source_details of this UpdateKnowledgeBaseSourceUpdateDetailsItem.
        :type: oci.aidataplatform_dp.models.UpdateKnowledgeBaseAddSourceDetails
        """
        self._update_knowledge_base_add_source_details = update_knowledge_base_add_source_details

    @property
    def update_knowledge_base_delete_source_details(self):
        """
        Gets the update_knowledge_base_delete_source_details of this UpdateKnowledgeBaseSourceUpdateDetailsItem.

        :return: The update_knowledge_base_delete_source_details of this UpdateKnowledgeBaseSourceUpdateDetailsItem.
        :rtype: oci.aidataplatform_dp.models.UpdateKnowledgeBaseDeleteSourceDetails
        """
        return self._update_knowledge_base_delete_source_details

    @update_knowledge_base_delete_source_details.setter
    def update_knowledge_base_delete_source_details(self, update_knowledge_base_delete_source_details):
        """
        Sets the update_knowledge_base_delete_source_details of this UpdateKnowledgeBaseSourceUpdateDetailsItem.

        :param update_knowledge_base_delete_source_details: The update_knowledge_base_delete_source_details of this UpdateKnowledgeBaseSourceUpdateDetailsItem.
        :type: oci.aidataplatform_dp.models.UpdateKnowledgeBaseDeleteSourceDetails
        """
        self._update_knowledge_base_delete_source_details = update_knowledge_base_delete_source_details

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
