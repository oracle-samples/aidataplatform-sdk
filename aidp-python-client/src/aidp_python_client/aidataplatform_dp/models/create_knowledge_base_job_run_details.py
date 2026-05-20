# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class CreateKnowledgeBaseJobRunDetails(object):
    """
    Request body for creating a new job run for a job in a KnowledgeBase.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new CreateKnowledgeBaseJobRunDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param description:
            The value to assign to the description property of this CreateKnowledgeBaseJobRunDetails.
        :type description: str

        """
        self.swagger_types = {
            'description': 'str'
        }

        self.attribute_map = {
            'description': 'description'
        }

        self._description = None

    @property
    def description(self):
        """
        Gets the description of this CreateKnowledgeBaseJobRunDetails.
        The description of KB Job


        :return: The description of this CreateKnowledgeBaseJobRunDetails.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this CreateKnowledgeBaseJobRunDetails.
        The description of KB Job


        :param description: The description of this CreateKnowledgeBaseJobRunDetails.
        :type: str
        """
        self._description = description

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
