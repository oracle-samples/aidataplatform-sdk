# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class OntologyGraphPreviewEdge(object):
    """
    Graph edge in a design-time ontology preview.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new OntologyGraphPreviewEdge object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param id:
            The value to assign to the id property of this OntologyGraphPreviewEdge.
        :type id: str

        :param label:
            The value to assign to the label property of this OntologyGraphPreviewEdge.
        :type label: str

        :param source_id:
            The value to assign to the source_id property of this OntologyGraphPreviewEdge.
        :type source_id: str

        :param target_id:
            The value to assign to the target_id property of this OntologyGraphPreviewEdge.
        :type target_id: str

        """
        self.swagger_types = {
            'id': 'str',
            'label': 'str',
            'source_id': 'str',
            'target_id': 'str'
        }

        self.attribute_map = {
            'id': 'id',
            'label': 'label',
            'source_id': 'sourceId',
            'target_id': 'targetId'
        }

        self._id = None
        self._label = None
        self._source_id = None
        self._target_id = None

    @property
    def id(self):
        """
        **[Required]** Gets the id of this OntologyGraphPreviewEdge.

        :return: The id of this OntologyGraphPreviewEdge.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """
        Sets the id of this OntologyGraphPreviewEdge.

        :param id: The id of this OntologyGraphPreviewEdge.
        :type: str
        """
        self._id = id

    @property
    def label(self):
        """
        **[Required]** Gets the label of this OntologyGraphPreviewEdge.

        :return: The label of this OntologyGraphPreviewEdge.
        :rtype: str
        """
        return self._label

    @label.setter
    def label(self, label):
        """
        Sets the label of this OntologyGraphPreviewEdge.

        :param label: The label of this OntologyGraphPreviewEdge.
        :type: str
        """
        self._label = label

    @property
    def source_id(self):
        """
        **[Required]** Gets the source_id of this OntologyGraphPreviewEdge.

        :return: The source_id of this OntologyGraphPreviewEdge.
        :rtype: str
        """
        return self._source_id

    @source_id.setter
    def source_id(self, source_id):
        """
        Sets the source_id of this OntologyGraphPreviewEdge.

        :param source_id: The source_id of this OntologyGraphPreviewEdge.
        :type: str
        """
        self._source_id = source_id

    @property
    def target_id(self):
        """
        **[Required]** Gets the target_id of this OntologyGraphPreviewEdge.

        :return: The target_id of this OntologyGraphPreviewEdge.
        :rtype: str
        """
        return self._target_id

    @target_id.setter
    def target_id(self, target_id):
        """
        Sets the target_id of this OntologyGraphPreviewEdge.

        :param target_id: The target_id of this OntologyGraphPreviewEdge.
        :type: str
        """
        self._target_id = target_id

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
