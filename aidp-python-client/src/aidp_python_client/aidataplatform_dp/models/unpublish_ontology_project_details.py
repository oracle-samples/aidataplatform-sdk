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

        :param ontology_name:
            The value to assign to the ontology_name property of this UnpublishOntologyProjectDetails.
        :type ontology_name: str

        :param delete_artifacts:
            The value to assign to the delete_artifacts property of this UnpublishOntologyProjectDetails.
        :type delete_artifacts: bool

        """
        self.swagger_types = {
            'comment': 'str',
            'ontology_name': 'str',
            'delete_artifacts': 'bool'
        }

        self.attribute_map = {
            'comment': 'comment',
            'ontology_name': 'ontologyName',
            'delete_artifacts': 'deleteArtifacts'
        }

        self._comment = None
        self._ontology_name = None
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
    def ontology_name(self):
        """
        Gets the ontology_name of this UnpublishOntologyProjectDetails.
        Published ontology name to unpublish when the project has multiple published identities. When omitted, OMS unpublishes the latest published deployment recorded for the project.


        :return: The ontology_name of this UnpublishOntologyProjectDetails.
        :rtype: str
        """
        return self._ontology_name

    @ontology_name.setter
    def ontology_name(self, ontology_name):
        """
        Sets the ontology_name of this UnpublishOntologyProjectDetails.
        Published ontology name to unpublish when the project has multiple published identities. When omitted, OMS unpublishes the latest published deployment recorded for the project.


        :param ontology_name: The ontology_name of this UnpublishOntologyProjectDetails.
        :type: str
        """
        self._ontology_name = ontology_name

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
