# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class UnpublishOntologyProjectDetails(object):
    """
    Details for removing published ontology project artifacts.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new UnpublishOntologyProjectDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param comment:
            The value to assign to the comment property of this UnpublishOntologyProjectDetails.
        :type comment: str

        :param delete_artifacts:
            The value to assign to the delete_artifacts property of this UnpublishOntologyProjectDetails.
        :type delete_artifacts: bool

        """
        self.swagger_types = {
            'comment': 'str',
            'delete_artifacts': 'bool'
        }

        self.attribute_map = {
            'comment': 'comment',
            'delete_artifacts': 'deleteArtifacts'
        }

        self._comment = None
        self._delete_artifacts = None

    @property
    def comment(self):
        """
        Gets the comment of this UnpublishOntologyProjectDetails.

        :return: The comment of this UnpublishOntologyProjectDetails.
        :rtype: str
        """
        return self._comment

    @comment.setter
    def comment(self, comment):
        """
        Sets the comment of this UnpublishOntologyProjectDetails.

        :param comment: The comment of this UnpublishOntologyProjectDetails.
        :type: str
        """
        self._comment = comment

    @property
    def delete_artifacts(self):
        """
        Gets the delete_artifacts of this UnpublishOntologyProjectDetails.
        Whether to delete stored publish artifacts such as compile reports. Defaults to true.


        :return: The delete_artifacts of this UnpublishOntologyProjectDetails.
        :rtype: bool
        """
        return self._delete_artifacts

    @delete_artifacts.setter
    def delete_artifacts(self, delete_artifacts):
        """
        Sets the delete_artifacts of this UnpublishOntologyProjectDetails.
        Whether to delete stored publish artifacts such as compile reports. Defaults to true.


        :param delete_artifacts: The delete_artifacts of this UnpublishOntologyProjectDetails.
        :type: bool
        """
        self._delete_artifacts = delete_artifacts

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
