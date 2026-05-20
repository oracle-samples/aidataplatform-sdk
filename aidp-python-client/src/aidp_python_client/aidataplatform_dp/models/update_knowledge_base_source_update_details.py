# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class UpdateKnowledgeBaseSourceUpdateDetails(object):
    """
    The information to be updated for KnowledgeBase source.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new UpdateKnowledgeBaseSourceUpdateDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param sources:
            The value to assign to the sources property of this UpdateKnowledgeBaseSourceUpdateDetails.
        :type sources: list[oci.aidataplatform_dp.models.UpdateKnowledgeBaseSourceUpdateDetailsItem]

        """
        self.swagger_types = {
            'sources': 'list[UpdateKnowledgeBaseSourceUpdateDetailsItem]'
        }

        self.attribute_map = {
            'sources': 'sources'
        }

        self._sources = None

    @property
    def sources(self):
        """
        Gets the sources of this UpdateKnowledgeBaseSourceUpdateDetails.
        Batch Payload for updating KnowledgeBase sources. Items marked for deletion are processed before items marked for addition


        :return: The sources of this UpdateKnowledgeBaseSourceUpdateDetails.
        :rtype: list[oci.aidataplatform_dp.models.UpdateKnowledgeBaseSourceUpdateDetailsItem]
        """
        return self._sources

    @sources.setter
    def sources(self, sources):
        """
        Sets the sources of this UpdateKnowledgeBaseSourceUpdateDetails.
        Batch Payload for updating KnowledgeBase sources. Items marked for deletion are processed before items marked for addition


        :param sources: The sources of this UpdateKnowledgeBaseSourceUpdateDetails.
        :type: list[oci.aidataplatform_dp.models.UpdateKnowledgeBaseSourceUpdateDetailsItem]
        """
        self._sources = sources

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
